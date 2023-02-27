package hildatul.wardah.tugas_final_bootcamp_idn.data.network.api


import hildatul.wardah.tugas_final_bootcamp_idn.ResponseSeafood
import retrofit2.Response
import retrofit2.http.GET

interface FoodApi {
    @GET("")
    fun getFood() : Response<ResponseSeafood>
}