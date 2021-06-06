package fr.esgi.baldwars_android.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import fr.esgi.baldwars_android.api.models.User
import retrofit2.Response
import retrofit2.http.*

interface UserService {

    @GET("/users")
    suspend fun findAll(): Response<MutableList<User>>

}