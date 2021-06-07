package fr.esgi.baldwars_android.api.models


data class User (
    val id: Int? = null,
    val username: String? = null,
    val firstname: String? = null,
    val lastname: String? = null,
    val rank: Int? = 0,
    val email: String? = null,
    val password: String? = null
)