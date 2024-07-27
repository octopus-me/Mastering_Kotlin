package org.example.classes

interface Product{
    var id: String
    var name: String
    var price: Double
    var quantity: Int

    fun sell(quantity: Int)

    fun restock(quantity: Int)

}