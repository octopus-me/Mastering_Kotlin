package org.example.classes

class DiscountedProduct(
    id: String,
    name: String,
    price: Double,
    quantity: Int,
    private val discountPercentage: Double,
) : SimpleProduct(id, name, price, quantity){
    fun calculateDiscountedPrice() : Double{
        return this.price * (100-discountPercentage) / 100
    }
}