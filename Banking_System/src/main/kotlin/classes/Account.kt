package org.example.classes

interface Account {
    var accountNumber: String
    var balance: Double

    fun deposit(amount: Double){

    }

    fun withdraw(amount: Double){

    }
}