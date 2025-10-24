package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

@WebMvcTest(BookController.class)
public class BookControllerMvcTestOfAddBook {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookServiceMock;

    private BookDto book1;
    List<BookDto> booksList;

    @BeforeEach
    void setUp() {
        book1 = new BookDto("Title 1", "Author 1");
        booksList = new ArrayList<>();

        Mockito.doAnswer(invocation -> {
            BookDto book = invocation.getArgument(0);
            booksList.add(book);
            return book;
        }).when(bookServiceMock).addBook(Mockito.any(BookDto.class));
    }

    @Test
    void shouldAddBook() throws Exception {
        // Przygotowanie danych do wysłania jako JSON
        Gson gson = new Gson();
        String bookJson = gson.toJson(book1);  // Zamiana obiektu BookDto na JSON

        mockMvc.perform(post("/books")
                        .contentType("application/json")
                        .content(bookJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Title 1"))
                .andExpect(jsonPath("$.author").value("Author 1"));

        assertTrue(booksList.contains(book1));
    }
}
