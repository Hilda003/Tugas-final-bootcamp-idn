package hildatul.wardah.tugas_final_bootcamp_idn

import android.util.Log
import hildatul.wardah.tugas_final_bootcamp_idn.ResponseSeafood
import hildatul.wardah.tugas_final_bootcamp_idn.data.network.api.FoodApi
import hildatul.wardah.tugas_final_bootcamp_idn.data.network.handler.NetworkResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val foodApi: FoodApi) {
    suspend fun getFood() : Flow<NetworkResult<ResponseSeafood>> = flow {
        try {
            emit(NetworkResult.Loading(true))
            val food = foodApi.getFood()

            //request data successful
            if (food.isSuccessful){
                val responseBody = food.body()

                //if data empty
                if (responseBody?.) {
                    emit(NetworkResult.Error("List Food No Found"))
                } else {
                    emit(NetworkResult.Success(responseBody!!))
                }
            } else {
                Log.d("apiServiceError", "statusCode:${food.code()}, message:${food.message()}")
                emit(NetworkResult.Error("Failed to fetch data from server"))

            }

        } catch (err:Exception){
            err.printStackTrace()
            Log.d("remoteError", "${err.message}")
            emit(NetworkResult.Error("Something went worng"))
        }
    }.flowOn(Dispatchers.IO)
}