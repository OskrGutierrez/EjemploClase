package com.example.ejemploclase

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputEditText

class RegistroSuperheroeActivity : AppCompatActivity() {
    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_superheroe)

        // val nombre_variable--> inmutable, var nombre_variable-->mutable

        val registrarBoton: Button = findViewById(R.id.registrar_boton)
        val registroEditText: EditText = findViewById(R.id.registro_sh_edit_text)
        val infoTextView: TextView = findViewById(R.id.info_registro_sh)
        val estaturaEditText: TextInputEditText = findViewById(R.id.estatura_edit_text)
        val masculinoRadioButton: RadioButton = findViewById(R.id.masculino_radio_button)

        registrarBoton.setOnClickListener {
            val nombre : String = registroEditText.text.toString() //val nombre = registroEditText.text
            val estatura : Float = estaturaEditText.text.toString().toFloat()
            val genero: String
            val fuerzaCheckBox: CheckBox = findViewById(R.id.super_fuerza_check_box)
            val velocidadCheckBox: CheckBox = findViewById(R.id.velocidad_check_box)
            val telequinesisCheckBox: CheckBox = findViewById(R.id.telequinesis_check_box)
            val ciudadNacimientoSpinner: Spinner = findViewById(R.id.ciudad_nacimiento_spinner)
            val ciudadNacimiento = ciudadNacimientoSpinner.selectedItem.toString()
            var poderes= ""


            if (masculinoRadioButton.isChecked)
                genero= getString(R.string.masculino)
            else
                genero= getString(R.string.femenino)

            if (fuerzaCheckBox.isChecked) poderes = getString(R.string.super_fuerza)
            if (velocidadCheckBox.isChecked) poderes = poderes + " " + getString(R.string.super_velocidad)
            if (telequinesisCheckBox.isChecked) poderes = poderes + " " + getString(R.string.telequinesis)


            infoTextView.text = getString(R.string.mostrarinfo, nombre, estatura, genero, poderes, ciudadNacimiento) //Otra forma de usar setText --> registroEditText.setText("Hola bebe")
        }
    }
}