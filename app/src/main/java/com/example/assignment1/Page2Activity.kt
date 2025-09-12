package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page2)

        val login=findViewById<TextView>(R.id.loginbutton)
        login.setOnClickListener {
            val intent= Intent(this, Page13Activity::class.java)
            startActivity(intent)
            finish()
        }

        val signup=findViewById<TextView>(R.id.signuptext)
        signup.setOnClickListener {
            val intent = Intent(this, Page4Activity::class.java)
            startActivity(intent)
        }

        val switch=findViewById<TextView>(R.id.switchtext)
        switch.setOnClickListener {
            val intent = Intent(this, Page3Activity::class.java)
            startActivity(intent)
        }


    }
}