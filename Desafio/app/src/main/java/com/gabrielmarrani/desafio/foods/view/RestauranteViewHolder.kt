package com.gabrielmarrani.desafio.foods.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Restaurante
import com.squareup.picasso.Picasso

class RestauranteViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val img = view.findViewById<ImageView>(R.id.listImage)
    private val nome = view.findViewById<TextView>(R.id.listNome)
    private val horario = view.findViewById<TextView>(R.id.listHorario)
    private val endereco = view.findViewById<TextView>(R.id.listEndereco)


    fun bind(restaurante: Restaurante) {


        nome.text = restaurante.nome
        horario.text = "Fecha às ${restaurante.horario}"
        endereco.text = restaurante.endereco

        Picasso.get()
            .load(restaurante.imagem)
            .into(img)

    }

}