package app.nitish.nasaAPP.today

import android.os.Bundle
import androidx.navigation.NavDirections
import app.nitish.nasaAPP.R
import kotlin.Int
import kotlin.Long

class TodayFragmentDirections private constructor() {
  private data class ActionTodayPhotoFragmentToPictureFragment(
    val id: Long = 0L
  ) : NavDirections {
    override fun getActionId(): Int = R.id.action_todayPhotoFragment_to_pictureFragment

    override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("id", this.id)
      return result
    }
  }

  companion object {
    fun actionTodayPhotoFragmentToPictureFragment(id: Long = 0L): NavDirections =
        ActionTodayPhotoFragmentToPictureFragment(id)
  }
}
