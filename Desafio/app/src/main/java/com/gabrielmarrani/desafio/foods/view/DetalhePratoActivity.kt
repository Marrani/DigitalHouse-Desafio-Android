package com.gabrielmarrani.desafio.foods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.gabrielmarrani.desafio.R
import com.squareup.picasso.Picasso

class DetalhePratoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_prato)

        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

        findViewById<ImageView>(R.id.imgBackPrato).setOnClickListener {
            val intent = Intent(this, ListaRestauranteActivity::class.java)
            startActivity(intent)
        }


        val imagem = intent.getStringExtra("IMAGEM")!!.toInt()
        val nome = intent.getStringExtra("NOME")
        val descricao = intent.getStringExtra("DESCRICAO")

        findViewById<TextView>(R.id.txtTituloPrato).text = nome
        findViewById<TextView>(R.id.txtDescricaoPrato).text = descricao

        Picasso.get()
            .load(imagem)
            .into(findViewById<ImageView>(R.id.imgPrato))
    }
}