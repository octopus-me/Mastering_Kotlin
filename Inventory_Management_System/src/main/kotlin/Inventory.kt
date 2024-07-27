package org.example

import org.example.classes.Product
import org.example.classes.Transaction

class Inventory {
    private var products: MutableList<Product> = mutableListOf()
    private var transactions: MutableList<Transaction> = mutableListOf()

    fun addProduct(product: Product) {
        products.add(product)
        println("Product ${product.name} added to the inventory.")
    }

    fun removeProduct(product: Product) {
        val prod = findProductById(product)
        if(prod != null) {
            products.remove(prod)
            println("Product ${product.name} removed from the inventory.")
        } else println("Product ${product.name} not found.")
    }

    private fun findProductById(product: Product): Product? {
        return products.find{it.id == product.id}
    }

    fun processTransaction(transaction: Transaction) {
        transactions.add(transaction)

        when(transaction.type) {
            "SALE" -> {
                transaction.product.sell(transaction.quantity)
            }
            "RESTOCK" -> {
                transaction.product.restock(transaction.quantity)
            }
        }
        println("Transaction processed: ${transaction.transactionId}")
    }
}