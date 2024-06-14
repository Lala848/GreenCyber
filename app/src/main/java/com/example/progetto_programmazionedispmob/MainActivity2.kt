package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //PRIMO BOTTONE RIFERITO ALL'AZIENDA
        var button1 =  findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, Accesso_Seconda_Pagina::class.java)
            startActivity(intent)
        }

        //SECONDO BOTTONE
        var button2= findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this, Accesso_Seconda_Pagina::class.java)
            startActivity(intent)
        }

        //TERZO BOTTONE
        var button3= findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent= Intent(this, Accesso_Seconda_Pagina::class.java)
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