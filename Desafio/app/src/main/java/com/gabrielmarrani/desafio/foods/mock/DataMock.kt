package com.gabrielmarrani.desafio.foods.mock

import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Restaurante
import com.squareup.picasso.Picasso

class DataMock {
    companion object {

        val restaurante = listOf(
            Restaurante("Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00",
                1
                ),
            Restaurante("Ayoama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "00:00",
                2
             ),
            Restaurante("Outback - Moema",
                "Av. Moaci, 187, 187 - Moema - São Paulo",
                "00:00",
                3
            ),
            Restaurante("Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "01:00",
                4
            )
        )

    }
}
