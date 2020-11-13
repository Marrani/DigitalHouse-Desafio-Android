package com.gabrielmarrani.desafio.foods.view

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Prato
import com.gabrielmarrani.desafio.foods.model.Restaurante
import com.squareup.picasso.Picasso

class PratoViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    private val img = view.findViewById<ImageView>(R.id.imgMenuRestaurante)
    private val nome = view.findViewById<TextView>(R.id.txtMenuRestaurante)

    fun bind(prato: Prato) {
        nome.text = prato.nome

        Picasso.get()
            .load(prato.imagem)
            .into(img)
    }
}