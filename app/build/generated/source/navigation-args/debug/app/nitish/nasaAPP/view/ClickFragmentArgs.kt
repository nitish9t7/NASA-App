package app.nitish.nasaAPP.view

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Long
import kotlin.jvm.JvmStatic

data class ClickFragmentArgs(
  val id: Long = 0L
) : NavArgs {
  fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("id", this.id)
    return result
  }

  companion object {
    @JvmStatic
    fun fromBundle(bundle: Bundle): ClickFragmentArgs {
      bundle.setClassLoader(ClickFragmentArgs::class.java.classLoader)
      val __id : Long
      if (bundle.containsKey("id")) {
        __id = bundle.getLong("id")
      } else {
        __id = 0L
      }
      return ClickFragmentArgs(__id)
    }
  }
}
