package com.gabrielmarrani.desafio.foods.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Prato
import com.gabrielmarrani.desafio.foods.model.Restaurante

class PratoAdpter(private val dataSet: List<Prato>, private val listener: (Prato) -> Unit):
    RecyclerView.Adapter<PratoViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratoViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.list_prato, parent, false)

            return PratoViewHolder(view)
        }

        override fun getItemCount() = dataSet.size

        override fun onBindViewHolder(holder: PratoViewHolder, position: Int) {
            val item = dataSet[position]
            holder.bind(item)
            holder.itemView.setOnClickListener { listener(item) }
        }
}