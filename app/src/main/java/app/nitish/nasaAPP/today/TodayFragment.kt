package app.nitish.nasaAPP.today

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import app.nitish.nasaAPP.R
import app.nitish.nasaAPP.NASA.NASA
import app.nitish.nasaAPP.NASA.hasImage
import app.nitish.nasaAPP.NASA.hasVideo
import app.nitish.nasaAPP.date.NASADatePickerFactory
import app.nitish.nasaAPP.shared.ImageCache
import app.nitish.nasaAPP.shared.OneShotEventObserver
import app.nitish.nasaAPP.shared.Resource
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_today_photo.*
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId
import java.time.ZoneOffset
import javax.inject.Inject

/**
 * Displays Today's [NASA].
 */
@AndroidEntryPoint
class TodayFragment : Fragment() {
    @Inject lateinit var imageCache: ImageCache
    private val viewModel: TodayViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        imageCache.attachApplicationContext(requireContext().applicationContext)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today_photo, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.NASA.observe(viewLifecycleOwner, Observer { resource ->
            when(resource) {
                is Resource.Success -> {
                    todaySwipeRefreshLayout.isRefreshing = false
                    updateNASA(resource.data)
                }
                is Resource.Loading -> {
                    if(!todaySwipeRefreshLayout.isRefreshing) {
                        todaySwipeRefreshLayout.isRefreshing = true
                    }
                }
                is Resource.Error -> {
                    val error = resource.error
                    todaySwipeRefreshLayout.isRefreshing = false
                    todayTitle.text = getString(R.string.today_error)
                    todayDescription.text = error
                    todayPicture.visibility = View.GONE

                    todayVideoLinkBtn.hide()
                    todayImageLinkBtn.show()
                }
            }
        })
        viewModel.navigateVideoLink.observe(viewLifecycleOwner,
            OneShotEventObserver { url ->
                url?.let {
                    navigateToLink(it)
                }
            })
        viewModel.navigateFullPicture.observe(viewLifecycleOwner,
            OneShotEventObserver { id ->
                val action =
                    TodayFragmentDirections.actionTodayPhotoFragmentToPictureFragment(
                        id
                    )
                requireActivity().findNavController(R.id.nav_host_fragment).navigate(action)
            })

        action_choose_day.setOnClickListener{
            showDatePicker()
        }
        todayVideoLinkBtn.setOnClickListener {
            viewModel.onPhotoClicked()
        }
        todayVideoLinkBtn.hide()
        todayImageLinkBtn.show()
        todayImageLinkBtn.setOnClickListener{
            viewModel.onPhotoClicked()
        }

        todayContainer.doOnPreDraw {
            val isPortrait = it.height >= it.width
//            todayPicture.layoutParams.height = if(isPortrait) it.width / 4 * 3 else it.height
        }
        todayPicture.setOnClickListener {
            viewModel.onPhotoClicked()
        }
        todaySwipeRefreshLayout.apply {
            setColorSchemeResources(R.color.colorSecondary)
            setProgressBackgroundColorSchemeResource(R.color.colorSurface)
            setOnRefreshListener {
                viewModel.refresh()
            }
        }
    }

    override fun onDestroy() {
        imageCache.detachApplicationContext()
        super.onDestroy()
    }

    private fun navigateToLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }


    private fun showDatePicker() {
        val datePicker = NASADatePickerFactory.create(viewModel.currentDate() ?: LocalDate.now())
        datePicker.addOnPositiveButtonClickListener { selection: Long ->
            viewModel.updateDate(Instant.ofEpochMilli(selection).atZone(ZoneId.ofOffset("UTC", ZoneOffset.UTC)).toLocalDate())
        }
        datePicker.show(parentFragmentManager, "datePicker")
    }

    private fun updateNASA(NASA: NASA) {
        todayTitle.text = NASA.title
        todayDescription.text = NASA.explanation
        if(NASA.copyright == null) {
        } else {
        }
        if(NASA.hasImage()) {
            todayVideoLinkBtn.hide()
            todayImageLinkBtn.show()
            Glide.with(this)
                .load(NASA.hdurl ?: NASA.url)
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(todayPicture)
        }
        else if(NASA.hasVideo()) {
            todayVideoLinkBtn.hide()
            todayImageLinkBtn.show()
            Glide.with(this)
                .load("https://img.youtube.com/vi/" + NASA.url.split("/embed/")[1].split("?")[0]  + "/maxresdefault.jpg")
                .centerCrop()
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(todayPicture)
            todayVideoLinkBtn.show()
            todayImageLinkBtn.hide()
        }
        else {
            todayPicture.visibility = View.GONE
            todayVideoLinkBtn.show()
            todayImageLinkBtn.hide()
        }
    }
}
