package com.willy.activitiessimple

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el layout de la actividad
        setContentView(R.layout.constraint_layout)

        val email = findViewById<TextView>(R.id.email_c).text
        val password = findViewById<TextView>(R.id.password_c).text

        fun aviso (data1: CharSequence, data2: CharSequence) {
            val message = "Email: $data1, Contraseña: $data2"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        // Creamos una variable para guardar el id del boton
        val myButton = findViewById<Button>(R.id.button_c)
        myButton.setOnClickListener {
            aviso(email, password)
        }
    }
}