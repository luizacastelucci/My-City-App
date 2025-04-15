package com.example.my_city_app.data

import com.example.my_city_app.R
import com.example.my_city_app.model.Museus

object LocalMuseuDataProvider {
    val defaultMuseus = getMuseusData()[0]

    fun getMuseusData(): List<Museus>{
        return listOf(
            Museus(
                id = 1,
                titleResourceId = R.string.museu1,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.museu_lingua_portugues,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text,
            ),
            Museus(
                id = 2,
                titleResourceId = R.string.museu2,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.museu_independencia,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text,
            ),
            Museus(
                id = 3,
                titleResourceId = R.string.museu3,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.masp,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text,
            ),
            Museus(
                id = 4,
                titleResourceId = R.string.museu4,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.museu_catavento,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text,
            ),
            Museus(
                id = 5,
                titleResourceId = R.string.museu5,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.museu_afro,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text,
            )
        )
    }
}