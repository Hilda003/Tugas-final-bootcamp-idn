package hildatul.wardah.tugas_final_bootcamp_idn.data.network.api

import hildatul.wardah.tugas_final_bootcamp_idn.ResponseMeal
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {
    @GET("")
    fun getNews() : Response<ResponseMeal>
}