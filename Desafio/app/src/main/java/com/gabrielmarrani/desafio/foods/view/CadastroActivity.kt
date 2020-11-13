package com.gabrielmarrani.desafio.foods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.gabrielmarrani.desafio.R
import com.google.android.material.textfield.TextInputEditText

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        findViewById<Button>(R.id.btnRegistrarCadastro).setOnClickListener {
            val nome = findViewById<TextInputEditText>(R.id.txtNameCad)
            val email = findViewById<TextInputEditText>(R.id.txtEmailCad)
            val senha =  findViewById<TextInputEditText>(R.id.txtSenhaCad)
            val repeatSenha = findViewById<TextInputEditText>(R.id.txtRepeatSenhaCad)

            validarCadastro(nome, email, senha, repeatSenha)

        }
    }

    private fun validarCadastro(
        nome: TextInputEditText,
        email: TextInputEditText,
        senha: TextInputEditText,
        repeatSenha: TextInputEditText
    ) {
        if (nome.text.toString().isEmpty()) {
            nome.setError("Favor preencher campo nome")
        } else if (email.text.toString().isEmpty()) {
            email.setError("Favor preencher campo e-mail")
        } else if (senha.text.toString().isEmpty()) {
            senha.setError("Favor preencher campo senha")
        } else if (repeatSenha.text.toString().isEmpty()) {
            repeatSenha.setError("Favor preencher campo repeat senha")
        } else if (senha.text.toString() != repeatSenha.text.toString()) {
            repeatSenha.setError("Senha incorreta")

        } else {
            val toast = Toast.makeText(
                applicationContext, "Cadastro efetuado!",
                Toast.LENGTH_LONG
            ).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}

