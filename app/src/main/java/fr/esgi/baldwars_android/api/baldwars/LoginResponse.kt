package fr.esgi.baldwars_android.api.baldwars

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("token") val token: String
)
