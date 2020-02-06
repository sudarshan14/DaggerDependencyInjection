package sid.angel.daggerdependencyinjection.solidprinciples.srp

import sid.angel.daggerdependencyinjection.solid.solidprinciples.srp.BookComposite
import sid.angel.daggerdependencyinjection.solid.module.BookFunctions


class Book(_author: String, _pageNumbers: Int) : BookFunctions {


    val author: String
    val pageNumbers: Int
    val bookComposite: BookComposite

    init {
        author = _author
        pageNumbers = _pageNumbers
        bookComposite = BookComposite()
    }


    fun getNumberofPages() {

    }

    override fun printBook() {

        this.bookComposite.printBookName(this)

    }

    override fun toString(): String {
        return "$author  $pageNumbers"
    }

}