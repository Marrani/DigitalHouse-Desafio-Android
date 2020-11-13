package com.gabrielmarrani.desafio.foods.mock

import com.gabrielmarrani.desafio.R
import com.gabrielmarrani.desafio.foods.model.Prato
import com.gabrielmarrani.desafio.foods.model.Restaurante

class DataMock {
    companion object {

        val tony = R.drawable.tony
        val ayoama = R.drawable.aoyama
        val outback = R.drawable.outback
        val si = R.drawable.si
        val imgPratoRestaurante = R.drawable.aoyama

        val restaurante = listOf(
            Restaurante("Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00",
                  tony

                ),
            Restaurante("Ayoama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "00:00",
                ayoama
             ),
            Restaurante("Outback - Moema",
                "Av. Moaci, 187, 187 - Moema - São Paulo",
                "00:00",
                outback
            ),
            Restaurante("Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "01:00",
                si
            )
        )

        val pratos = listOf(
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."
            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            ),
            Prato(
                "Salada com molho Gengibre" ,
                imgPratoRestaurante,
                "Sed ut perspiciatis, unde omnis iste natus error" +
                        " sit voluptatem accusant doloremque laudantium, " +
                        "totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."

            )
        )

    }
}
