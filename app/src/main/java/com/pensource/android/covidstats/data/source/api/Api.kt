package com.pensource.android.covidstats.data.source.api

import retrofit2.http.GET

interface Api {

    val BASE_URL: String
        get() = "https://api.covid19api.com/"

    @GET("summary")
    fun getStats(): StatsResponse

}