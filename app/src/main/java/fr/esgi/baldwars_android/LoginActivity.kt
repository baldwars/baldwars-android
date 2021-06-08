package fr.esgi.baldwars_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class LoginActivity : AppCompatActivity() {
    lateinit var LogInButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        LogInButton =  findViewById(R.id.LogInButton)

        LogInButton.setOnClickListener {
            clickLogInButton()
        }
    }

    private fun clickLogInButton() {
        try {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}