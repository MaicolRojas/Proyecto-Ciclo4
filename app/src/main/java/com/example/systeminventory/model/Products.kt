package com.example.systeminventory.model

import java.io.Serializable

class Products: Serializable {
    lateinit var name: String
    lateinit var price: String
    lateinit var url: String
    lateinit var detail: String
}