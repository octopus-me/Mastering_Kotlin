package org.example.classes

class CheckingAccount(
    override var accountNumber: String,
    override var balance: Double,
    var overdraftLimit: Double,
):Account {
    override fun withdraw(amount: Double) {
        if(amount > balance + overdraftLimit) println("Insufficient funds")
        else {
            balance -= amount
            println("Succesful withdrawal \n" +
                    "Your new balance is $ $balance")
        }
    }
    override fun deposit(amount: Double) {
        if(amount > 0){
            balance += amount
            println("Deposit completed \n" +
                    "You new balance is $ $balance")
        }
    }
}