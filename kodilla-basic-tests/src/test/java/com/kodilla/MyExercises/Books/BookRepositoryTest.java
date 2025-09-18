package com.kodilla.MyExercises.Books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {

    BookRepository bookRepository;

    @BeforeEach
    public void setUp() {
        bookRepository = new BookRepository();
        bookRepository.addBook("Rowling", new Book("Harry 1", 1997));
    }

    @Test
    void shouldAddBooksAndCountThem() {
        // given
        bookRepository.addBook("Rowling", new Book("Harry 2", 1998));
        bookRepository.addBook("Tolkien", new Book("LOTR", 1954));

        // when
        Map<String, List<Book>> map = bookRepository.getAuthorsBookList();

        // then
        assertEquals(2, map.size());
        assertEquals(2, map.get("Rowling").size());
        assertEquals(1, map.get("Tolkien").size());
    }

    @Test
    void shouldVerifyGetBooksByAuthor(){
        List<Book> expectedResult = new ArrayList<>();
        expectedResult.add(new Book("Harry 1", 1997));
        assertEquals(expectedResult, bookRepository.getBooksByAuthorGet("Rowling"));
    }
}