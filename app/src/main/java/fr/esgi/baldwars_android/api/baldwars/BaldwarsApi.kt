package fr.esgi.baldwars_android.api.baldwars

import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object BaldwarsApi {
    private var baldwarsApiService: BaldwarsApiService? = null

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://baldwars-api.chukitipok.qtmsheep.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        baldwarsApiService = retrofit.create(BaldwarsApiService::class.java)
    }

    fun login(credentials: LoginRequest, callback: Callback<LoginResponse>) {
        val call = baldwarsApiService?.login(credentials)
        call?.enqueue(callback)
    }
}
