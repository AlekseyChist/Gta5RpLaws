package com.example.gta5rplaws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val processLawCardView = findViewById<CardView>(R.id.card_view_processualnij)
        processLawCardView.setOnClickListener{
            val intent = Intent(this, ProcessLawActivity::class.java)
            startActivity(intent)
        }

        val uakLawCardView = findViewById<CardView>(R.id.card_view_UAK)
        uakLawCardView.setOnClickListener{
            val intent = Intent(this, UakLawActivity::class.java)
            startActivity(intent)
        }

        val roadLawCardView = findViewById<CardView>(R.id.card_view_road_codex)
        roadLawCardView.setOnClickListener{
            val intent = Intent(this, RoadLawActivity::class.java)
            startActivity(intent)
        }

        val tenCodeCardView = findViewById<CardView>(R.id.card_view_ten_codes)
        tenCodeCardView.setOnClickListener{
            val intent = Intent(this, TenFour::class.java)
            startActivity(intent)
        }
    }
}