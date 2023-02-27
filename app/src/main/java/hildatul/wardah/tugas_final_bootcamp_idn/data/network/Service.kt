package hildatul.wardah.tugas_final_bootcamp_idn.data.network

import hildatul.wardah.tugas_final_bootcamp_idn.data.network.api.FoodApi
import hildatul.wardah.tugas_final_bootcamp_idn.utils.Constant.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Service {
    private val retrofit by lazy {
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    val FoodServices: FoodApi by lazy {
        retrofit.create(FoodApi::class.java)
    }
}