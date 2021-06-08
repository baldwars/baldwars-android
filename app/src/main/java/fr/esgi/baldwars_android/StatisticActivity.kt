package fr.esgi.baldwars_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.lang.Exception

class StatisticActivity : AppCompatActivity() {
    lateinit var BackButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistic)

        BackButton = findViewById(R.id.BackButton)

        BackButton.setOnClickListener {
            clickBackButton()
        }
    }

    fun clickBackButton() {
        try {
            finish()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}