package com.example.ejemploclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegistroSuperheroeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_superheroe)

        // val nombre_variable--> inmutable, var nombre_variable-->mutable

        val registrarBoton: Button = findViewById(R.id.registrar_boton)
        val registroEditText: EditText = findViewById(R.id.registro_sh_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_registro_sh)

        registrarBoton.setOnClickListener {
            val nombre = registroEditText.text
            infoTextView.text = nombre //Otra forma de usar setText --> registroEditText.setText("Hola bebe")
        }
    }
}