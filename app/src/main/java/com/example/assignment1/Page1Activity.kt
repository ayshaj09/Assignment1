package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page1)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Page2Activity::class.java)
            startActivity(intent)
            finish()
        }, 5000)



    }
}