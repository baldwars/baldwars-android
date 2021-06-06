package fr.esgi.baldwars_android.api

import fr.esgi.baldwars_android.api.models.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {

    @POST("/auth/register")
    suspend fun addUser(@Body user: User): Response<User>

    @GET("/auth/login")
    suspend fun login(@Body user: User): Response<User>

}