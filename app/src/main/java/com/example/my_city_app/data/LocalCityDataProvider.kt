package com.example.my_city_app.data

import com.example.my_city_app.R
import com.example.my_city_app.model.Places

object LocalCityDataProvider {
    val defaultPlace = getPlaceData()[0]
    // define que o valor padrão será o primeiro item da lista

    fun getPlaceData(): List<Places> {
        return listOf(
            Places(
                id = 1,
                titleResourceId = R.string.museus,
                subtitleResourceId = R.string.place_list_subtitle,
                more = R.string.saber_mais,
                imageResourceId = R.drawable.masp,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text
            ),
            Places(
                id = 2,
                titleResourceId = R.string.parques,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.ibirapuera,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_detail_text
            ),
            Places(
                id = 3,
                titleResourceId = R.string.restaurantes,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.petrosgreek,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 4,
                titleResourceId = R.string.fast_foods,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.burgerking,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 5,
                titleResourceId = R.string.cafeterias,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.urbecafe,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 6,
                titleResourceId = R.string.shopping,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.spmarket,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 7,
                titleResourceId = R.string.lojas,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.americanas,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 8,
                titleResourceId = R.string.academias,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.smartfit,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            ),
            Places(
                id = 9,
                titleResourceId = R.string.igrejas,
                subtitleResourceId = R.string.place_list_subtitle,
                imageResourceId = R.drawable.catedralse,
                placeImageBanner = R.drawable.banner,
                placeDetails = R.string.place_list_subtitle
            )
        )
    }
}