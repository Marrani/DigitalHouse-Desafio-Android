package com.gabrielmarrani.desafio.foods.view

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.ClipDrawable.VERTICAL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.mock.DataMock
import com.gabrielmarrani.desafio.foods.model.Restaurante

class ListaRestauranteActivity : AppCompatActivity() {

    private lateinit var listRestaurantes: List<Restaurante>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_restaurante)
        listRestaurantes = DataMock.restaurante
        criarLista(listRestaurantes)

    }


    fun criarLista(restaurante: List<Restaurante>) {
        val recyclerView = findViewById<RecyclerView>(R.id.lista)
        val manager = GridLayoutManager(this, 1)

        val customAdapter = CustomAdpter(listRestaurantes) {
            val intent = Intent(this@ListaRestauranteActivity, DetalheRestauranteActivity::class.java)
            intent.putExtra("IMAGEM", it.imagem.toString())
            intent.putExtra("NOME", it.nome)

            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = customAdapter
        }
    }
}