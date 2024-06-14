package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Pagina_Registrati : AppCompatActivity() {

    private lateinit var editTextTextEmailAddress2: EditText
    private lateinit var editTextTextEmailAddress3: EditText
    private lateinit var editTextTextPassword2: EditText
    private lateinit var editTextTextPassword3: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pagina_registrati)

        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2)
        editTextTextEmailAddress3 = findViewById(R.id.editTextTextEmailAddress3)
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2)
        editTextTextPassword3 = findViewById(R.id.editTextTextPassword3)


        val buttonNextPage= findViewById<Button>(R.id.buttonNextPage)
        buttonNextPage.setOnClickListener {

            val email = editTextTextEmailAddress2.text.toString().trim()
            val Confermaemail = editTextTextEmailAddress3.text.toString().trim()
            val password = editTextTextPassword2.text.toString().trim()
            val Confermapassword = editTextTextPassword3.text.toString().trim()

            if (email.isEmpty()) {
                editTextTextEmailAddress2.error = "Nessun Username"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                editTextTextPassword2.error = "Nessuna Password"
                return@setOnClickListener
            }else if (password.isEmpty()) {
                editTextTextEmailAddress2.error = "Nessuna Email"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                editTextTextPassword2.error = "Nessuna Password"
                return@setOnClickListener
            }  else {
                Toast.makeText(this, "Registrazione Riuscita", Toast.LENGTH_SHORT).show()
                val intent= Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

        }
    }
