package hildatul.wardah.tugas_final_bootcamp_idn.data

import hildatul.wardah.tugas_final_bootcamp_idn.ResponseMeal
import hildatul.wardah.tugas_final_bootcamp_idn.data.network.api.FoodApi
import hildatul.wardah.tugas_final_bootcamp_idn.data.network.handler.NetworkResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LocalDataSource {
    suspend fun getNews():Flow<NetworkResult<ResponseMeal>> = flow {
        try {
            emit(NetworkResult.Loading(true))
            val meal = FoodApi
        }
    }
}