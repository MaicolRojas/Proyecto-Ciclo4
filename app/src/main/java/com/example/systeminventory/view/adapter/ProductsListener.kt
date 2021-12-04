package com.example.systeminventory.view.adapter

import com.example.systeminventory.model.Products

interface ProductsListener {
    fun OnProductsClick(product:Products, position: Int)
}