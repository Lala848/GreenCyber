package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Abbonamento_Mensile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_abbonamento_mensile)

        val button5= findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val intent= Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        }
    }
