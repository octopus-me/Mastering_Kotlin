package org.example

import org.example.classes.Book
import org.example.classes.Library
import org.example.classes.Member


import java.util.*


fun createLibrary(): Library{
    var library: Library = Library()
    return library
}

fun addNewBooks(library: Library, listOfBooks: List<Book>){
    for (book in listOfBooks){
        library.addBook(book)
    }
}

fun generateUUID():String{
    val uuid = UUID.randomUUID()
    return uuid.toString()
}

fun callSelectedOption(option: Int){
    if(option == 1){
        println("Selected option is 1: Create New Member \n")
        print("Name: ")
        var name = readln()
        var member:Member = Member(name)
        

    }
}

fun main(){
    var biblioteca: Library = createLibrary()

    while(true){
        println("Select your option \n" +
                "1- Create New Member \n" +
                "2- Remove Member \n" +
                "3- Find Member \n" +
                "4- Add New Book \n" +
                "5- Remove Book \n"
        )
        var option = readln()
        callSelectedOption(option.toInt())



    }

}