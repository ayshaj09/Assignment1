package com.example.assignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page19Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page19)


        val back= findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            finish()
        }

        val back2= findViewById<LinearLayout>(R.id.story)
        back2.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            finish()
        }

        val back3= findViewById<LinearLayout>(R.id.close)
        back3.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            finish()
        }

        val back4= findViewById<ImageView>(R.id.go)
        back4.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            finish()
        }
    }
}