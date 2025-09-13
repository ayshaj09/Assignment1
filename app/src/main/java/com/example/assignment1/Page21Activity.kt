package com.example.assignment1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import de.hdodenhof.circleimageview.CircleImageView

class Page21Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page21)

        val fol = findViewById<LinearLayout>(R.id.following)
        fol.setOnClickListener {
            val intent = Intent(this, Page22Activity::class.java)
            startActivity(intent)
            finish()
        }

        val back= findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val st=findViewById<FrameLayout>(R.id.story)
        st.setOnClickListener {
            val intent= Intent(this, Page18Activity::class.java)
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

        val prof=findViewById<FrameLayout>(R.id.prof)
        prof.setOnClickListener {
            val intent= Intent(this, Page13Activity::class.java)
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