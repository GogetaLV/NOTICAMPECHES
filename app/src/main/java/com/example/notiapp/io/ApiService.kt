package com.example.notiapp.io
import retrofit2.htt.POST
interface ApiService {
@POST(value = "Login")
fun (Query(value = "email") email:String,@Query(value="password") password:String):
    call<LoginResponse>
companion object{
    private const val BASE_URL =""
    fun create():ApiService{
        val retrofit = Retrofit.Buildeer()
            .base(BSE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiService::class.java)
    }

}
}