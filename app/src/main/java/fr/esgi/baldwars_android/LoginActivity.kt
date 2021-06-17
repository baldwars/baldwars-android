package fr.esgi.baldwars_android

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import fr.esgi.baldwars_android.api.baldwars.BaldwarsApi
import fr.esgi.baldwars_android.api.baldwars.LoginRequest
import fr.esgi.baldwars_android.api.baldwars.LoginResponse
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity(), Callback<LoginResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginButton.setOnClickListener {
            clickLogInButton()
        }
    }

    private fun clickLogInButton() {
        loader.visibility = View.VISIBLE
        val credentials = LoginRequest(username.text.toString(), password.text.toString())
        BaldwarsApi.login(credentials, this)
    }

    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
        val shared: SharedPreferences = this.getSharedPreferences("baldwars", MODE_PRIVATE)
        val edit = shared.edit()

        val token = response.body()?.token
        loader.visibility = View.GONE

        if (token != null) {
            edit.putString("token", response.body()?.token)
            edit.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        else {
            Toast
                .makeText(this, "Bad credentials", Toast.LENGTH_LONG)
                .show()
        }
    }

    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
        loader.visibility = View.GONE
        println(t)
    }
}