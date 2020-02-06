package sid.angel.daggerdependencyinjection.solid.solidprinciples.srp

import sid.angel.daggerdependencyinjection.solidprinciples.srp.Book

class BookComposite {

    fun printBookName(book: Book) {

     println("Book Author is $book")
    }
}