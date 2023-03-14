package org.example.library;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {

    @Mock
    private List<Book> bookList;
    @Mock
    private Book book;
    @InjectMocks
    private Library library;

    @Test
    public void getAllBooks_shouldReturnAllBooks_whenThereIsBookList() {

        when(library.getAllBooks(bookList)).thenReturn(bookList);

        List<Book> actual = library.getAllBooks(bookList);

        List<Book> expected = bookList;

        verify(library).getAllBooks(bookList);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void getNumberOfBooks_shouldReturnCorrectSum_whenThereAreBooks() {

        when(library.getNumberOfBooks(bookList)).thenReturn(4);

        int actual = library.getNumberOfBooks(bookList);

        int expected = 4;

        verify(library).getNumberOfBooks(bookList);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findBookByTitle_shouldReturnCorrectSum_whenThereAreBooks() {

        when(library.findBookByTitle("Big Frog", bookList)).thenReturn(Optional.of(book));

        Optional<Book> actual = library.findBookByTitle("Big Frog", bookList);

        Book expected = book;

        verify(library).findBookByTitle("Big Frog", bookList);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void findBookWithMostPages_shouldReturnCorrectSum_whenThereAreBooks() {

        when(library.FindBookWithMaxNumberofPages(bookList)).thenReturn(Optional.of(book));

        Optional<Book> actual = library.FindBookWithMaxNumberofPages(bookList);

        Book expected = book;

        verify(library).FindBookWithMaxNumberofPages(bookList);

        assertThat(actual).isEqualTo(expected);
    }
}
