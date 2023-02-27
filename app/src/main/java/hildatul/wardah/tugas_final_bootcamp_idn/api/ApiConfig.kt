package hildatul.wardah.tugas_final_bootcamp_idn.api

import hildatul.wardah.tugas_final_bootcamp_idn.data.network.api.FoodApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    private const val baseUrl = "https://www.themealdb.com/api/"

    private fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getService() : FoodApi {
        return getRetrofit().create(FoodApi::class.java)
    }
}