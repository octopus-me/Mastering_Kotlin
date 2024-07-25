package org.example.classes

class Book (
    val title: String,
    val author: String,
    val isbn: String,
    var isAvailable: Boolean = true,
) {
    fun checkOut(){
        if(isAvailable){
            isAvailable = false
        } else {
            println("Book is not available")
        }
    }

    fun returnBook(){
        if(!isAvailable){
            isAvailable = false
        } else {
            println("Book has not been borrowed")
        }
    }

}