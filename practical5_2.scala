import scala.io.StdIn.readLine;
import scala.collection.mutable.Set;

object q2{
    case class book(title: String, author: String, ISBN: String);
    
    def displayBooks(library: Set[book]):Unit ={
        library.foreach(b => println(s"Title: ${b.title}, Author: ${b.author}, ISBN: ${b.ISBN}"));

    }
    def addBook(library: Set[book]):Set[book]={

        println("Enter book title:");
        val title:String = readLine();

        println("Enter book author:");
        val author:String = readLine();

        println("Enter book ISBN:");
        val ISBN:String = readLine();

        val newBook =book(title, author, ISBN);
        library += newBook;

    }
    def removeBook(library: Set[book]):Set[book]={
        println("Enter book ISBN to delete:");
        val userISBN:String = readLine();
        val bookToRemove = library.find(_.ISBN == userISBN);

        bookToRemove match{
            case Some(book) =>
                library -= book;
                println(s"${book.title}, ${book.author}, ${book.ISBN} book deleted.")
            case None =>
                println("Book not found.");
        }
        library;
    }
    def checkBook(library: Set[book]):Unit={
        println("Enter book ISBN to check:");
        val userISBN:String = readLine();
        val bookToCheck = library.find(_.ISBN == userISBN);

        bookToCheck match{
            case Some(book) =>
                println(s"'${book.title}, ${book.author}, ${book.ISBN}' book found.")
            case None =>
                println("Book not found.");
        }
    }
    def checkBookByTitle(library: Set[book]):Unit={
        println("Enter book title to check:");
        val userTitle:String=readLine();
        val bookToCheck = library.find(_.title == userTitle);

        bookToCheck match{
            case Some(book) =>
                println(s"'${book.title}, ${book.author}, ${book.ISBN}' book found.")
            case None =>
                println("Book not found.");
        }
    }
    def checkBooksByAuthor(library: Set[book]):Unit ={
        println("Enter book author to check:");
        val userAuthor:String=readLine();
        val authorBooks = library.filter(_.author == userAuthor);
        
        if(!authorBooks.isEmpty){
            println(s"Books by ${userAuthor}:")
            authorBooks.foreach(book => println(s"${book.title}") );
        }else{
            println("Not books are found.")
        }

    }
    
    def main(args: Array[String]):Unit={
        var library: Set[book] = Set(
            book("book1", "author1", "b001"),
            book("book2", "author2", "b002"),
            book("book3", "author3", "b003")
            );
        
        
        // println("Library before adding a book:");
        // displayBooks(library);
        // library = addBook(library);
        // println("Library after adding a book:")
        // displayBooks(library);


        // println("Library before removing a book:")
        // displayBooks(library);
        // library = removeBook(library);
        // println("Library after removing a book:")
        // displayBooks(library);
        
        // println("Before checking a book:");
        // displayBooks(library);
        // checkBook(library);

        // println("Before checking a book:");
        // displayBooks(library);
        // checkBookByTitle(library);

        // println("Before checking a book:");
        // displayBooks(library);
        // checkBooksByAuthor(library);
    }
}