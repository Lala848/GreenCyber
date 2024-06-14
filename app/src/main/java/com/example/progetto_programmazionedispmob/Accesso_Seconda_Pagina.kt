package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton
import androidx.core.view.WindowInsetsCompat

class Accesso_Seconda_Pagina : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_accesso_seconda_pagina);

        //assegno la variabile e la cerco con l'id
        val imageButton1: ImageButton = findViewById(R.id.imageButton1)

        //grazie a questa funziona setonclick, gli do la possibilità di poter agire sull'immagine
        imageButton1.setOnClickListener {
            //android.content mi fa vedere il contenuto e mi fa agire su esso
            val first = Intent(android.content.Intent.ACTION_VIEW)
            //gli passo il link con usi
            first.data = Uri.parse("https://youtu.be/MJxtTIyuqlI?si=mi2ZjDoe9mcPJfAu")

            //attiva il tutto
            startActivity(first)
        }

        val imagebutton2: ImageButton = findViewById(R.id.imageButton2)

        imagebutton2.setOnClickListener {
            val second = Intent(android.content.Intent.ACTION_VIEW)
            second.data = Uri.parse("https://youtu.be/B5kO21Y-8Sc?si=Twyd_OrMsI1PsLZl")

            startActivity(second)
        }

        val imagebutton3: ImageButton = findViewById(R.id.imageButton3)

        imagebutton3.setOnClickListener {
            val third = Intent(android.content.Intent.ACTION_VIEW)
            third.data = Uri.parse("https://youtu.be/x1foneMG9ho?si=4PHy7VSlKS8fixUi")

            startActivity(third)
        }

        //ACCESSO ABBONAMENTI
        val imagebuttonLucc = findViewById<ImageButton>(R.id.imagebuttonLucc)
        imagebuttonLucc.setOnClickListener {
            val intent = Intent(this, Abbonamenti::class.java)
            startActivity(intent)
        }

        //ACCESSO PROFILO
        val imageButton4 = findViewById<ImageButton>(R.id.imageButton4)
        imageButton4.setOnClickListener {
            val intent = Intent(this, Profilo::class.java)
            startActivity(intent)
        }

        //ACCESSO IMPOSTAZIONI
        val imageButton5 = findViewById<ImageButton>(R.id.imageButton5)
        imageButton5.setOnClickListener {
            val intent = Intent(this, Imspostazioni::class.java)
            startActivity(intent)

        }
    }
}
