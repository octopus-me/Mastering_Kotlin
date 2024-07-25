# Library Management System

## Objective
Create a simple library management system that allow users to manage books and members. You will implement classes to represent books, library members, and the library itself.

## Requirements

1. **Book Class**
    - Properties:
      - **title**: String
      - **author**: String
      - **isbn**: String (unique identifier)
      - **isAvailable**: Boolean (default true)
    - Methods:
      - **checkOut()**: Marks the book as not available.
      - **returnBook()**: Marks the book as available.
2. **Member Class**
   - Properties:
     - **name**: String
     - **memberId**: String (unique identifier)
     - **borrowedBooks**: MutableList<Books>
   - Methods:
     - **borrowBook(book: Book)**: Allows the member to borrow a book if its available.
     - **returnBook(booK: Book)**: Allows the member to return a borrowed book
3. Library Class
   - Properties:
     - **books**: MutableList<Book>
     - **members**: MutableList<Member>
   - Methods:
     - **addBook(book: Book)**: Adds a new book to the library.
     - **removeBook(isbn: String):** Removes a book from the library by ISBN
     - **registerMember(member: Member)**: Registers a new library member.
     - **removeMember(memberId: String)**: Removes a member from the library by their member ID.
     - **findBookByTitle(title: String)**: List<Book>: Finds books by title.
     - **listAvailableBooks()**: List<Book>: Lists all available books.