package org.example.classes

open class SimpleProduct(
    override var id: String,
    override  var name: String,
    override  var price: Double,
    override  var quantity: Int,
) : Product {
    override fun sell(quantity: Int) {
        if(this.quantity >= quantity) {
            this.quantity -= quantity
            println("$quantity units of product $name sold. \n" +
                    " Remaining in stock ${this.quantity}")
        } else println("Not enough stock to sell $quantity")

    }

    override fun restock(quantity: Int){
        if(quantity >= 0){
            this.quantity += quantity
            println("$quantity units of product $name restocked \n" +
                    "Remaining in stock ${this.quantity}")
        }
    }
}