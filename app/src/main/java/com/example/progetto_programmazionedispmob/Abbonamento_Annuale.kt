package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Abbonamento_Annuale : AppCompatActivity() {

    private lateinit var editTextText4: EditText
    private lateinit var editTextText5: EditText
    private lateinit var editTextText6: EditText
    private lateinit var editTextText7: EditText
    private lateinit var editTextText8: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_abbonamento_annuale)

        editTextText4 = findViewById(R.id.editTextText4)
        editTextText5 = findViewById(R.id.editTextText5)
        editTextText6 = findViewById(R.id.editTextText6)
        editTextText7 = findViewById(R.id.editTextText7)
        editTextText8 = findViewById(R.id.editTextText8)


        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val nome_e_cognome = editTextText4.text.toString().trim()
            val numero_carta = editTextText5.text.toString().trim()
            val MM = editTextText6.text.toString().trim()
            val YY = editTextText7.text.toString().trim()
            val CVC = editTextText8.text.toString().trim()

            if (nome_e_cognome.isEmpty()) {
                editTextText4.error = "Nessun Nome o Cognome"
                return@setOnClickListener
            } else if (numero_carta.isEmpty()) {
                editTextText5.error = "Nessun Numero di Carta"
                return@setOnClickListener
            }else if (MM.isEmpty()) {
                editTextText7.error = "Nessun Mese"
                return@setOnClickListener
            }else if (YY.isEmpty()) {
                editTextText8.error = "Nessun Anno"
                return@setOnClickListener
            }else if (CVC.isEmpty()) {
                editTextText8.error = "Nessuna Password"
                return@setOnClickListener
            }else {
                Toast.makeText(this, "Riuscito", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Abbonamento_Mensile::class.java)
                startActivity(intent)

        }
    }





        }
    }



