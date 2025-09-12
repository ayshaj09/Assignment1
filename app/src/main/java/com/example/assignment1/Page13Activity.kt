package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Page13Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page13)

        val story=findViewById<FrameLayout>(R.id.story)
        story.setOnClickListener {
            val intent= Intent(this, Page20Activity::class.java)
            startActivity(intent)
        }

        val edit=findViewById<TextView>(R.id.edit)
        edit.setOnClickListener {
            val intent= Intent(this, Page15Activity::class.java)
            startActivity(intent)
        }

        val highlight=findViewById<LinearLayout>(R.id.highlight1)
        highlight.setOnClickListener {
            val intent= Intent(this, Page14Activity::class.java)
            startActivity(intent)
        }

        val highlight2=findViewById<LinearLayout>(R.id.highlight2)
        highlight2.setOnClickListener {
            val intent= Intent(this, Page14Activity::class.java)
            startActivity(intent)
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

        val ntf=findViewById<ImageView>(R.id.notif)
        ntf.setOnClickListener {
            val intent= Intent(this, Page11Activity::class.java)
            startActivity(intent)
            finish()
        }




    }
}