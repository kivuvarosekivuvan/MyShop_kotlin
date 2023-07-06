package com.rosekn.myshop

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("/products")
    fun getProducts(): Call<ProductResponse>

    @GET("/products/{id}")
    fun getProductById():Call<Product>
}