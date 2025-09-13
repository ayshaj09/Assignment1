package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page7Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page7)

        val back= findViewById<TextView>(R.id.back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val back2= findViewById<ImageView>(R.id.ext)
        back2.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val p1=findViewById<LinearLayout>(R.id.p1)
        p1.setOnClickListener {
            val intent= Intent(this, Page22Activity::class.java)
            startActivity(intent)
            finish()
        }

        val p2=findViewById<LinearLayout>(R.id.p2)
        p2.setOnClickListener {
            val intent= Intent(this, Page22Activity::class.java)
            startActivity(intent)
            finish()
        }

        val p3=findViewById<LinearLayout>(R.id.p3)
        p3.setOnClickListener {
            val intent= Intent(this, Page22Activity::class.java)
            startActivity(intent)
            finish()
        }

        val p4=findViewById<LinearLayout>(R.id.p4)
        p4.setOnClickListener {
            val intent= Intent(this, Page22Activity::class.java)
            startActivity(intent)
            finish()
        }

    }
}