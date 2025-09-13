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
import androidx.recyclerview.widget.LinearLayoutManager
import de.hdodenhof.circleimageview.CircleImageView

class Page12Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page12)

        val follow = findViewById<TextView>(R.id.following)
        follow.setOnClickListener {
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
        }

        val prof=findViewById<CircleImageView>(R.id.prof)
        prof.setOnClickListener {
            val intent= Intent(this, Page13Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}