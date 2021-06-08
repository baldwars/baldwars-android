package fr.esgi.baldwars_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
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

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "LagCloud", "PrimusGood", "HulkPoke", "TyraPrimus", "NovaRussian"
        )

        var RankingList = findViewById<ListView>(R.id.RankingList)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, users)
        RankingList.adapter = arrayAdapter
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