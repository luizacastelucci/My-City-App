package com.example.my_city_app.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.my_city_app.R

data class Museus (
    val id: Int,
    @StringRes val titleResourceId: Int,
    @StringRes val subtitleResourceId: Int,
    @StringRes val more: Int = R.string.saber_mais,
    @DrawableRes val imageResourceId: Int,
    @DrawableRes val placeImageBanner: Int = R.drawable.banner,
    @StringRes val placeDetails: Int
)