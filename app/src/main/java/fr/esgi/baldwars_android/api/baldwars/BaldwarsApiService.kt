package fr.esgi.baldwars_android.api.baldwars

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface BaldwarsApiService {

    @POST("auth/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>

}