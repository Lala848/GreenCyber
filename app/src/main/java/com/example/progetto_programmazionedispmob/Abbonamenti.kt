package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Abbonamenti : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_abbonamenti)

        val imagebutton1= findViewById<ImageButton>(R.id.imageButton1)
        imagebutton1.setOnClickListener {
            val intent= Intent(this, Abbonamento_Annuale::class.java)
            startActivity(intent)
        }

        val imagebutton2= findViewById<ImageButton>(R.id.imageButton2)
        imagebutton2.setOnClickListener {
            val intent= Intent(this, Abbonamento_Annuale::class.java)
            startActivity(intent)
        }

        val imagebutton3= findViewById<ImageButton>(R.id.imageButton3)
        imagebutton3.setOnClickListener {
            val intent= Intent(this, Abbonamento_Annuale::class.java)
            startActivity(intent)
        }

        val imagebutton10= findViewById<ImageButton>(R.id.imageButton10)
        imagebutton10.setOnClickListener {
            val intent= Intent(this, Abbonamento_Annuale::class.java)
            startActivity(intent)
        }

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
