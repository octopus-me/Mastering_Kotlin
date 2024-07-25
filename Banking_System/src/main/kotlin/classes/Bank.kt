package org.example.classes

class Bank {
    var users: MutableList<User> = mutableListOf()
    var transactions: MutableList<Transaction> = mutableListOf()

    fun registerUser(
        name: String,
        userId: String,
    ) {
        var user = users.find{ it.userId == userId}

        if(user != null) println("User already registered")
        else {
            user = User(name, userId, mutableListOf())
            users.add(user)
            println("User registered")
        }
    }

    fun removeUser(userId: String) {
        var user = users.find{it.userId == userId}

        if(user != null) users.remove(user)
        else println("User not registered")
    }

    fun findUserById(userId: String): User? {
        return users.find{ it.userId == userId}
    }

    fun processTransaction(transaction: Transaction) {
        val source: Account = transaction.sourceAccount
        val destination: Account? = transaction.destinationAccount

        when (transaction.type) {
            "DEPOSIT" -> {
                source.deposit(transaction.amount).
            }
            "WITHDRAW" -> {
                source.withdraw(transaction.amount).
            }
            "TRANSFER" -> {
                source.
            }
        }

    }
}