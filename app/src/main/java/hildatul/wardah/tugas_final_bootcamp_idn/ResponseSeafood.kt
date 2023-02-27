package hildatul.wardah.tugas_final_bootcamp_idn

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class ResponseSeafood(

	@field:SerializedName("meals")
	val meals: List<MealsItem>
) : Parcelable

@Parcelize
data class MealsItem(

	@field:SerializedName("strMealThumb")
	val strMealThumb: String,

	@field:SerializedName("idMeal")
	val idMeal: String,

	@field:SerializedName("strMeal")
	val strMeal: String
) : Parcelable
