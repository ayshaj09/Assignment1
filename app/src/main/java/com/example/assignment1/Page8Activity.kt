package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page8)

        val back= findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val dm = findViewById<LinearLayout>(R.id.dm1)
        dm.setOnClickListener {
            val intent = Intent(this, Page9Activity::class.java)
            startActivity(intent)
        }

        val dm2 = findViewById<LinearLayout>(R.id.dm2)
        dm2.setOnClickListener {
            val intent = Intent(this, Page9Activity::class.java)
            startActivity(intent)
        }

        val dm3 = findViewById<LinearLayout>(R.id.dm3)
        dm3.setOnClickListener {
            val intent = Intent(this, Page9Activity::class.java)
            startActivity(intent)
        }

        val dm4 = findViewById<LinearLayout>(R.id.dm4)
        dm4.setOnClickListener {
            val intent = Intent(this, Page9Activity::class.java)
            startActivity(intent)
        }
    }
}