package org.example.library;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        List<Book> newBookList = library.createBooklist();

        System.out.println("Books in the library: " + library.getAllBooks(newBookList));
        System.out.println("Number of books available: " + library.getNumberOfBooks(newBookList));
        System.out.println("Book by the title " + library.findBookByTitle("Big Frog", newBookList));
        System.out.println("Book which has most pages: " + library.FindBookWithMaxNumberofPages(newBookList));
    }
}
