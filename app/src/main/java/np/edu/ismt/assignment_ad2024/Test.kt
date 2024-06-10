package np.edu.ismt.assignment_ad2024

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable
import java.lang.reflect.TypeVariable

@Parcelize
data class Test(
    val variable1: String,
    val variable2: Int
): Parcelable
