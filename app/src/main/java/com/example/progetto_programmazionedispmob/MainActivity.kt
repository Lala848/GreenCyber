package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {

    //La parola chiave "lateinit" in Kotlin, viene utilizzata per dichiarare quelle variabili che sono garantite per essere inizializzate in futuro
    private lateinit var editTextTextEmailAddress2: EditText
    private lateinit var editTextTextPassword2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //dichiaro la variabile bottone con il proprio nome
        //findViewById=  è utilizzato in Android per ottenere il riferimento a un'istanza di una view all'interno del layout XML di un'attività
        //Uso l'id per puntare al bottone, sempre con il nome
        var buttonNextPrograms = findViewById<Button>(R.id.buttonNextPage)
        //var Stabilisce una variabile mutabile, il cui valore può essere modificato dopo essere stato assegnato.


        //uso il nome del bottone per fare il setonclick
        //setOnClickListener= Quando l'utente fa clic sul pulsante, il codice all'interno del blocco {} viene eseguito. Questo ti consente di definire il
        //comportamento che desideri eseguire quando il pulsante viene premuto, come ad esempio aprire un'altra attività,


        editTextTextEmailAddress2 = findViewById(R.id.editTextTextEmailAddress2)
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2)

        buttonNextPrograms.setOnClickListener {

            val email = editTextTextEmailAddress2.text.toString().trim()
            val password = editTextTextPassword2.text.toString().trim()

            if (email.isEmpty()) {
                editTextTextEmailAddress2.error = "Nessun Username"
                return@setOnClickListener
            } else if (password.isEmpty()) {
                editTextTextPassword2.error = "Nessuna Password"
                return@setOnClickListener
            } else {
                makeText(this, "Accesso Riuscito", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, MainActivity2::class.java)
                    startActivity(intent) //farà l'esecuzione, quindi passa nell'altra pagina
                    //crea un oggetto Intent che viene utilizzato per avviare un'altra attività in un'applicazione Android.
                    //il this viene usato per puntare direttamente alla classe secondaria, di destinazione
                    //val Stabilisce una variabile immutabile, il cui valore non può essere modificato dopo essere stato assegnato una volta.
                }
            }


        }
    }

