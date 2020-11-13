package com.gabrielmarrani.desafio.foods.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.mock.DataMock
import com.gabrielmarrani.desafio.foods.model.Prato
import com.gabrielmarrani.desafio.foods.model.Restaurante
import com.squareup.picasso.Picasso


class DetalheRestauranteActivity : AppCompatActivity() {

    private lateinit var listPratos: List<Prato>
    private lateinit var listRestaurantes: List<Restaurante>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_restaurante)

        findViewById<ImageView>(R.id.imgBack).setOnClickListener {
            val intent = Intent(this, ListaRestauranteActivity::class.java)
            startActivity(intent)
        }

        listPratos = DataMock.pratos
        listRestaurantes = DataMock.restaurante
        criarLista(listPratos)



        val imagem = intent.getStringExtra("IMAGEM")!!.toInt()
        val nome = intent.getStringExtra("NOME")
            findViewById<TextView>(R.id.txtTituloRestaurante).text = nome


            Picasso.get()
                .load(imagem)
                .into(findViewById<ImageView>(R.id.imageMenuRestaurante))



    }


    fun criarLista(prato: List<Prato>) {
        val recyclerView = findViewById<RecyclerView>(R.id.detalheRestaurante)
        val manager = GridLayoutManager(this, 2)

        val pratoAdpter = PratoAdpter(listPratos) {
            val intent = Intent(this@DetalheRestauranteActivity, DetalhePratoActivity::class.java)
            intent.putExtra("NOME", it.nome)
            intent.putExtra("IMAGEM", it.imagem.toString())
            intent.putExtra("DESCRICAO", it.descricao)



            startActivity(intent)
        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = manager
            adapter = pratoAdpter
        }
    }

}