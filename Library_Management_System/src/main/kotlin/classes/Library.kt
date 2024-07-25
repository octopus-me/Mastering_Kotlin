package org.example.classes

class Library {
    private var books: MutableList<Book> = mutableListOf()
    private var members: MutableList<Member> = mutableListOf()

    fun addBook(book: Book){
        books.add(book)
        println("Added ${book.title}")
    }

    fun removeBook(book: Book){
        if(books.contains(book)){
            books.remove(book)
            println("Removed $book")
        } else println("Not found")
    }

    fun registerMember(member: Member){
        if(!members.contains(member)){
            members.add(member)
            println("Added $member")
        } else println("Not found")
    }

    fun removeMember(member: Member){
        if(members.contains(member)){
            members.remove(member)
            println("Removed $member")
        } else println("Not found")

    }

    fun findBookByTitle(title: String): List<Book>{
        return books.filter{it.title.contains(title, ignoreCase = true)}
    }

    fun listAvailableBooks(): List<Book>{
        return books.filter{it.isAvailable}

    }

    fun findMember(id: String):Member?{
        val member: List<Member> = members.filter{it.memberId==id}

        if(member.isNotEmpty()) return member[0]
        else println("No members found")
        return null

    }
}