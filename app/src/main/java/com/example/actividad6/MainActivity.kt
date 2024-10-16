package com.example.actividad6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textoEditado = findViewById<EditText>(R.id.editText)
        val botonEnviar = findViewById<Button>(R.id.button)

        botonEnviar.setOnClickListener {
            val userText = textoEditado.text.toString()
            Toast.makeText(this, userText, Toast.LENGTH_LONG).show()
        }
    }
}