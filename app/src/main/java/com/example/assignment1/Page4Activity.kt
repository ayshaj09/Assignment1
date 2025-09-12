package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page4Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page4)

        val login = findViewById<TextView>(R.id.account)
        login.setOnClickListener {
            val intent = Intent(this, Page13Activity::class.java)
            startActivity(intent)
            finish()
        }

        val back= findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}