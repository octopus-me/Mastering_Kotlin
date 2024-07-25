package org.example.classes

class User(
    val name: String,
    val userId: String,
    var accounts: MutableList<Account>
) {
    fun addAccount(account: Account){
        accounts.add(account)
        println("Account added!")
    }

    fun removeAccount(accountNumber: String){
        val account = accounts.find{ it.accountNumber == accountNumber }
        if(account != null){
            accounts.remove(account)
            println("Account removed!")
        } else {
            println("Account not found!")
        }
    }



}