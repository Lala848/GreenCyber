package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Consulenze : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_consulenze)

        val imagebutton12: ImageButton = findViewById(R.id.imageButton12)

        imagebutton12.setOnClickListener {
            val third = Intent(Intent.ACTION_VIEW)
            third.data = Uri.parse("https://mail.google.com/mail/u/0/#inbox")

            startActivity(third)
        }

        }
    }
