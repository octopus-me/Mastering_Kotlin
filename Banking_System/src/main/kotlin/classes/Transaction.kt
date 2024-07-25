package org.example.classes

import java.util.*

data class Transaction (
    val transactionId: String = UUID.randomUUID().toString(),
    val sourceAccount: Account,
    val destinationAccount: Account?,
    val amount: Double,
    val type: String,
    val timestamp: Long = System.currentTimeMillis(),
)