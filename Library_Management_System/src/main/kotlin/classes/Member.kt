package org.example.classes

import java.util.*

class Member(
    private var name: String,
) {
    val memberId: String = UUID.randomUUID().toString()
    private var borrowedBooks: MutableList<Book> = mutableListOf()

    fun borrowBook(book: Book){

        if(book.isAvailable && borrowedBooks.size < 5){
            borrowedBooks.add(book)
            println("$name borrowed book ${book.title}")
        } else {

            if (! book.isAvailable) println("${book.title} not available book")
            else println("$name achieved limit of ${borrowedBooks.size} books")
        }
    }

    fun returnBook(book: Book){
        if(borrowedBooks.contains(book)){

            borrowedBooks.remove(book)
            println("$name returned book ${book.title}")

        } else println("$name did not borrow book ${book.title}")

    }


}