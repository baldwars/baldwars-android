package fr.esgi.baldwars_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var RankingButton : Button
    lateinit var ExitButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        RankingButton = findViewById(R.id.RankingButton)
        ExitButton = findViewById(R.id.ExitButton)

        RankingButton.setOnClickListener {
            clickRankingButton()
        }

        ExitButton.setOnClickListener {
            clickExitButton()
        }

    }

    fun clickRankingButton() {
        try {
            val intent = Intent(this, RankingActivity::class.java)
            startActivity(intent)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun clickExitButton() {
        try {
            moveTaskToBack(true)
            exitProcess(-1)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}