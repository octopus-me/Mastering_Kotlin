package org.example

import org.example.classes.SimpleProduct
import org.example.classes.PerishableProduct
import org.example.classes.DiscountedProduct
import org.example.classes.Transaction
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val inventory = Inventory()

    val apple = SimpleProduct("P001", "Apple", 0.5, 100)
    val milk = PerishableProduct("P002", "Milk", 1.0, 50, "2024-08-01")
    val chocolate = DiscountedProduct("P003", "Chocolate", 2.0, 30, 10.0)

    inventory.addProduct(apple)
    inventory.addProduct(milk)
    inventory.addProduct(chocolate)

    val saleTransaction = Transaction(product = apple, quantity = 10, type = "SALE")
    inventory.processTransaction(saleTransaction)

    val restockTransaction = Transaction(product = chocolate, quantity = 20, type = "RESTOCK")
    inventory.processTransaction(restockTransaction)

    val discountPrice = chocolate.calculateDiscountedPrice()
    println("Discounted price of ${chocolate.name}: $$discountPrice")

    val isMilkExpired = milk.isExpired("2024-02-24")
    println("Is milk expired? $isMilkExpired")
}