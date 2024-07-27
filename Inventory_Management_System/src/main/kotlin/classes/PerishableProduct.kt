package org.example.classes

class PerishableProduct(
    id: String,
    name: String,
    price: Double,
    quantity: Int,
    private var expirationDate: String,
) : SimpleProduct(id, name, price, quantity) {
    fun isExpired(currentDate: String): Boolean{
        return currentDate > expirationDate
    }

}