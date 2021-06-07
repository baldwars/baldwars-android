package fr.esgi.baldwars_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class RankingActivity : AppCompatActivity() {
    lateinit var BackButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        BackButton = findViewById(R.id.BackButton)

        BackButton.setOnClickListener {
            clickBackButton()
        }
    }

    fun clickBackButton() {
        try {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}