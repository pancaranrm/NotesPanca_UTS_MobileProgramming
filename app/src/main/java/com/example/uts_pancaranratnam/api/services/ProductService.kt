package com.example.uts_pancaranratnam.api.services

import com.example.uts_pancaranratnam.api.model.ProductResponses
import retrofit2.Call
import  retrofit2.http.GET


interface ProductService {
    @GET("products")
    fun getAll(): Call<ProductResponses>

}