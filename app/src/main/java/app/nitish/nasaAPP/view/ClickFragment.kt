package app.nitish.nasaAPP.view

import android.graphics.PointF
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toolbar
import androidx.annotation.NonNull
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.bumptech.glide.load.model.GlideUrl
import com.bumptech.glide.request.target.CustomViewTarget
import com.bumptech.glide.request.transition.Transition
import com.davemorrissey.labs.subscaleview.ImageSource
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView
import app.nitish.nasaAPP.R
import app.nitish.nasaAPP.shared.ImageCache
import app.nitish.nasaAPP.shared.Resource
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_picture.*
import java.io.File
import javax.inject.Inject

/**
 * A full screen view of an [NASA] picture.
 */
@AndroidEntryPoint
class ClickFragment : Fragment() {
    private val args: ClickFragmentArgs by navArgs()
    private var imageUri: Uri? = null
    private val viewModel: ClickFragViewModel by viewModels()
    @Inject lateinit var imageCache: ImageCache

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_picture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pictureToolbar.title = ""
        pictureToolbar.setNavigationOnClickListener {
            requireActivity().onBackPressed()
        }
        pictureToolbar.inflateMenu(R.menu.picture)
        pictureToolbar.setOnMenuItemClickListener(object: Toolbar.OnMenuItemClickListener,
            androidx.appcompat.widget.Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                return true
            }
        })
        NASAPicture.setScaleAndCenter(2f, PointF(100F, 1500F))
        NASAPicture.setDoubleTapZoomScale(1.4f)
        NASAPicture.isZoomEnabled
        NASAPicture.maxScale
        NASAPicture.maxScale
        NASAPicture.setDoubleTapZoomDuration(resources.getInteger(android.R.integer.config_shortAnimTime))
        imageCache.attachApplicationContext(requireContext().applicationContext)
        if(savedInstanceState == null) {
            val id = args.id
            viewModel.load(id)
        }
        viewModel.picture.observe(viewLifecycleOwner, Observer { resource ->
            when(resource) {
                is Resource.Success -> {
                    val url = resource.data.hdurl ?: resource.data.url
                    if(url.isEmpty()) {
                        showError(getString(R.string.error_empty_url))
                    } else {
                        if(resource.data.mediaType == "video"){
                            updateVideo(url)
                        }else {
                            updateImage(url)
                        }
                    }
                }
                is Resource.Error -> {
                    showError(getString(R.string.error_fetching))
                }
            }
        })
    }

    private fun updateVideo(url: String) {
        pictureError.visibility = View.GONE
        NASAPicture.visibility = View.GONE
        youtube_player_view.visibility = View.VISIBLE
        lililil.visibility = View.VISIBLE
        lifecycle.addObserver(youtube_player_view)

        youtube_player_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(@NonNull youTubePlayer: YouTubePlayer) {
                val videoId = url.split("/embed/")[1].split("?")[0]
                Log.d("URLWEGET", videoId)
                youTubePlayer.loadVideo(videoId, 0F)
                youTubePlayer.play()
            }
        })
    }

    override fun onDestroy() {
        imageUri = null
        imageCache.detachApplicationContext()
        super.onDestroy()
    }


    private fun updateImage(url: String) {
        pictureError.visibility = View.GONE
        NASAPicture.visibility = View.VISIBLE
        Glide.with(this)
            .asFile()
            .load(GlideUrl(url))
            .into(object: CustomViewTarget<SubsamplingScaleImageView, File>(NASAPicture) {
                override fun onLoadFailed(errorDrawable: Drawable?) {
                    NASAPicture.visibility = View.GONE
                    pictureError.visibility = View.VISIBLE
                    pictureError.text = getString(R.string.picture_error)
                }

                override fun onResourceCleared(placeholder: Drawable?) {}

                override fun onResourceReady(resource: File, transition: Transition<in File>?) {
                    imageUri = FileProvider.getUriForFile(requireContext(), "${requireContext().packageName}.fileprovider", resource)
                    imageUri?.let {
                        NASAPicture.setImage(ImageSource.uri(it))

                    }
                }
            })
    }

    private fun showError(error: String) {
        NASAPicture.visibility = View.GONE
        pictureError.text = error
    }
}