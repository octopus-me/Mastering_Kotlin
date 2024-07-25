package org.example.classes

class SavingsAccount(
    override var accountNumber: String,
    override var balance: Double,
    var interestRate: Double,
):Account{
    fun applyInterest(){
        balance += balance * (1+interestRate)
        println("Your new balance is $ $balance")

    }
    override fun deposit(amount: Double) {
        if(amount > 0){
            balance += amount
            println("You deposited $ $amount \n" +
                    "Your new balance is $ $balance")

        } else println("Invalid amount")
    }

    override fun withdraw(amount: Double) {
        if(amount > balance){
            println("Insufficient spendable balance")
        } else {
            balance -= amount
            println("You withdrawed $ $amount \n" +
            "Your new balance is $ $balance")
        }
    }
}