package com.pensource.android.covidstats.data.source.api

data class StatsResponse(
    val Countries: List<Country>,
    val Date: String,
    val Global: Global
)

data class Country(
    val Country: String,
    val CountryCode: String,
    val Date: String,
    val NewConfirmed: Int,
    val NewDeaths: Int,
    val NewRecovered: Int,
    val Slug: String,
    val TotalConfirmed: Int,
    val TotalDeaths: Int,
    val TotalRecovered: Int
)

data class Global(
    val NewConfirmed: Int,
    val NewDeaths: Int,
    val NewRecovered: Int,
    val TotalConfirmed: Int,
    val TotalDeaths: Int,
    val TotalRecovered: Int
)