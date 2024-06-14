package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Registrazioni : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registrazioni)

        val button30= findViewById<Button>(R.id.button30)
        button30.setOnClickListener {
            val intent= Intent(this, Pagina_Registrati::class.java)
            startActivity(intent)
        }
        }
    }
