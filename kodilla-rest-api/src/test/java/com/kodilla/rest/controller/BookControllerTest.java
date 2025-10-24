package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BookControllerTest {

    BookService bookServiceMock;
    BookController bookController;
    List<BookDto> booksList;
    BookDto book1;
    BookDto book2;

    @BeforeEach
    public void setUp(){
        bookServiceMock = Mockito.mock(BookService.class);
        bookController = new BookController(bookServiceMock);
        booksList = new ArrayList<>();
        book1 = new BookDto("Title 1", "Author 1");
        book2 = new BookDto("Title 1", "Author 2");
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);
    }

    @Test
    void shouldFetchBooks() {
        //given
        booksList.add(book1);
        booksList.add(book2);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBook() {

        // when
        bookController.addBook(book1); // Wywołujemy metodę addBook w kontrolerze

        // then
        // Weryfikujemy, czy metoda addBook została wywołana raz
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(book1);
    }
}