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

        val st1 = findViewById<LinearLayout>(R.id.story1)
        st1.setOnClickListener {
            val intent = Intent(this, Page20Activity::class.java)
            startActivity(intent)
        }

        val st2 = findViewById<LinearLayout>(R.id.story2)
        st2.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }

        val st3 = findViewById<LinearLayout>(R.id.story3)
        st3.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }

        val st4 = findViewById<LinearLayout>(R.id.story4)
        st4.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }

        val st5 = findViewById<LinearLayout>(R.id.story5)
        st5.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }

        val st6 = findViewById<LinearLayout>(R.id.story6)
        st6.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }

        val st7 = findViewById<LinearLayout>(R.id.story7)
        st7.setOnClickListener {
            val intent = Intent(this, Page18Activity::class.java)
            startActivity(intent)
        }
    }
}