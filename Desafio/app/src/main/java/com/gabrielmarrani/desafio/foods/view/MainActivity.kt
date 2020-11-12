package com.gabrielmarrani.desafio.foods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gabrielmarrani.desafio.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnRegistrar).setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnLogin).setOnClickListener {
            val intent = Intent(this, ListaRestauranteActivity::class.java)
            startActivity(intent)
        }
    }
}