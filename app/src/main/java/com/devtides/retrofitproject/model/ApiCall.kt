package com.devtides.retrofitproject.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiCall {

    @GET("apiCall")
    fun callGet(): Call<ApiCallResponse>

    @POST("apiCall")
    fun callPost(): Call<ApiCallResponse>


    @GET("apiCall?name=Alex&age=24")
    fun callQueryStatic(): Call<ApiCallResponse>

    @GET("apiCall")
    fun callQueryDynamic(@Query("name") n: String, @Query("age") a : Int): Call<ApiCallResponse>

    @GET("apiCall")
    fun callQueryDynamicNullable(@Query("name") n: String?, @Query("age") a : Int?): Call<ApiCallResponse>

    @GET("apiCall")
    fun callQueryMultiple(@QueryMap params: Map<String, String>): Call<ApiCallResponse>
}