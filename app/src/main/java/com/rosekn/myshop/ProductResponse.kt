package com.rosekn.myshop

data class ProductResponse(
    var products:List<Product>,
    var total:Int,
    var skip:Int,
    var limit:Int
)
