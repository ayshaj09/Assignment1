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
import com.example.assignment1.R.id.you
import de.hdodenhof.circleimageview.CircleImageView

class Page11Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page11)

        val you = findViewById<TextView>(R.id.you)
        you.setOnClickListener {
            val intent = Intent(this, Page12Activity::class.java)
            startActivity(intent)
            finish()
        }

        val home=findViewById<ImageView>(R.id.home)
        home.setOnClickListener {
            val intent= Intent(this, Page5Activity::class.java)
            startActivity(intent)
            finish()
        }

        val srch=findViewById<ImageView>(R.id.search)
        srch.setOnClickListener {
            val intent= Intent(this, Page6Activity::class.java)
            startActivity(intent)
            finish()
        }

        val pst=findViewById<ImageView>(R.id.post)
        pst.setOnClickListener {
            val intent= Intent(this, Page16Activity::class.java)
            startActivity(intent)
            finish()
        }

        val prof=findViewById<CircleImageView>(R.id.pfp)
        prof.setOnClickListener {
            val intent= Intent(this, Page13Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}