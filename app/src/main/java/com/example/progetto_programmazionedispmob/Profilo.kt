package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Profilo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profilo)

        //ACCESSO ABBONAMENTI
        val imagebuttonLucc= findViewById<ImageButton>(R.id.imagebuttonLucc)
        imagebuttonLucc.setOnClickListener {
            val intent= Intent(this, Abbonamenti::class.java)
            startActivity(intent)
        }

        //ACCESSO PROFILO
        val imageButton4= findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener {
            val intent= Intent(this, Profilo::class.java)
            startActivity(intent)
        }

        //ACCESSO IMPOSTAZIONI
        val imageButton5= findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener {
            val intent= Intent(this, Imspostazioni::class.java)
            startActivity(intent)
        }

        }
    }
