package org.example.classes

import java.util.*

data class Transaction (
    var transactionId: String = UUID.randomUUID().toString(),
    var product: Product,
    var quantity: Int,
    val type: String, //SALE or RESTOCK
    var timestamp: Long = System.currentTimeMillis(),
)