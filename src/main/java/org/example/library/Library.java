package org.example.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Library {

    public List<Book> createBooklist() {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Pride and Prejudice", 152));
        bookList.add(new Book("King Arthur", 285));
        bookList.add(new Book("Perfume", 295));
        bookList.add(new Book("Big Frog", 25));

        return bookList;
    }

    public List<Book> getAllBooks(List<Book> listName) {
        return listName.stream().toList();
    }

    public int getNumberOfBooks(List<Book> listName) {
        return listName.size();
    }

    public Optional<Book> findBookByTitle(String title, List<Book> listName) {
        return listName.stream().filter(book -> title.equals(book.getTitle())).findAny();
    }

    public Optional<Book> FindBookWithMaxNumberofPages(List<Book> listName) {
        return listName.stream().max(Comparator.comparingInt(Book::getPages));
    }
}
