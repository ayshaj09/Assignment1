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
import de.hdodenhof.circleimageview.CircleImageView

class Page5Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.page5)


//        val camera = findViewById<ImageView>(R.id.camera)
//        camera.setOnClickListener {
//            val intent = Intent(this, Page12Activity::class.java)
//            startActivity(intent)
//            finish()
//        }

        val dm = findViewById<ImageView>(R.id.dm)
        dm.setOnClickListener {
            val intent = Intent(this, Page8Activity::class.java)
            startActivity(intent)
        }

        val srch=findViewById<ImageView>(R.id.search)
        srch.setOnClickListener {
            val intent= Intent(this, Page6Activity::class.java)
            startActivity(intent)
            finish()
        }

        val pst=findViewById<ImageView>(R.id.postpost)
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

        val prof=findViewById<CircleImageView>(R.id.prof)
        prof.setOnClickListener {
            val intent= Intent(this, Page13Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}