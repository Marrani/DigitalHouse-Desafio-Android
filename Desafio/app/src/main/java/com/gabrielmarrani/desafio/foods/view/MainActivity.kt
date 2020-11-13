package com.gabrielmarrani.desafio.foods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.gabrielmarrani.desafio.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnRegistrar).setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val email = findViewById<TextInputEditText>(R.id.filledTextField)
            val senha = findViewById<TextInputEditText>(R.id.txtSenha)
            validarLogin(email, senha)


        }
    }

    private fun validarLogin(
        email: TextInputEditText,
        senha: TextInputEditText
    ) {
        if (email.text.toString().isEmpty()) {
            email.setError("Favor preencher campo e-mail")
        } else if (senha.text.toString().isEmpty()) {
            senha.setError("Favor preencher campo senha")
        } else {
            val intent = Intent(this, ListaRestauranteActivity::class.java)
            startActivity(intent)
        }
    }
}