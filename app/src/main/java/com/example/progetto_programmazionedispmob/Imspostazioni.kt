package com.example.progetto_programmazionedispmob

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class Imspostazioni : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imspostazioni)


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

        val imagebutton6= findViewById<ImageButton>(R.id.imageButton6)
        imagebutton6.setOnClickListener {
            val intent= Intent(this, Profilo::class.java)
            startActivity(intent)
        }

        val imagebutton7= findViewById<ImageButton>(R.id.imageButton7)
        imagebutton7.setOnClickListener {
            val intent= Intent(this, Abbonamenti::class.java)
            startActivity(intent)
        }

       val imagebutton8= findViewById<ImageButton>(R.id.imageButton8)
       imagebutton8.setOnClickListener {
            val intent= Intent(this, Consulenze::class.java)
                startActivity(intent)
        }

       val imagebutton9= findViewById<ImageButton>(R.id.imageButton9)
       imagebutton9.setOnClickListener {
         val intent= Intent(this, Registrazioni::class.java)
               startActivity(intent)
        }


        val imagebutton11= findViewById<ImageButton>(R.id.imageButton11)
          imagebutton11.setOnClickListener {
            val intent= Intent(this, Termini_E_Sicurezza::class.java)
              startActivity(intent)
        }

        val imagebutton10= findViewById<ImageButton>(R.id.imageButton10)
        imagebutton10.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        }
    }
