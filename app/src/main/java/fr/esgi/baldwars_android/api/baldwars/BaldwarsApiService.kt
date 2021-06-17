package fr.esgi.baldwars_android.api.baldwars

import fr.esgi.baldwars_android.api.baldwars.models.LoginRequest
import fr.esgi.baldwars_android.api.baldwars.models.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface BaldwarsApiService {

    @POST("auth/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>

}