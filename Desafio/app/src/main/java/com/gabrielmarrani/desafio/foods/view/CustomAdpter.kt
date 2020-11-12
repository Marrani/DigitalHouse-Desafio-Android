package com.gabrielmarrani.desafio.foods.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Restaurante

class CustomAdpter(private val dataSet: List<Restaurante>, private val listener: (Restaurante) -> Unit):
    RecyclerView.Adapter<RestauranteViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestauranteViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)

            return RestauranteViewHolder(view)
        }

        override fun getItemCount() = dataSet.size

        override fun onBindViewHolder(holder: RestauranteViewHolder, position: Int) {
            val item = dataSet[position]
            holder.bind(item)
            holder.itemView.setOnClickListener { listener(item) }
        }
}