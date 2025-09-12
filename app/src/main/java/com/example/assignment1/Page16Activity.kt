package com.example.assignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page16Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page16)


        val back= findViewById<TextView>(R.id.cancel)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val next= findViewById<TextView>(R.id.next)
        next.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }
}