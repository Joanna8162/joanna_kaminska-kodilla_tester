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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import com.google.gson.Gson;

@WebMvcTest(BookController.class)
public class BookControllerMvcTestOfAddBook {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookService bookServiceMock;

    private BookDto book1;

    @BeforeEach
    void setUp() {
        book1 = new BookDto("Title 1", "Author 1");
    }

    @Test
    void shouldAddBook() throws Exception {
        // Przygotowujemy dane do wysłania jako JSON
        Gson gson = new Gson();
        String bookJson = gson.toJson(book1);  // Zamieniamy obiekt BookDto na JSON

        Mockito.doNothing().when(bookServiceMock).addBook(Mockito.any(BookDto.class)); // nie chcemy testować wewnętrznej logiki systemu, tylko interakcję z HTTP z kontrolerem

        mockMvc.perform(post("/books")
                        .contentType("application/json")
                        .content(bookJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Title 1"))
                .andExpect(jsonPath("$.author").value("Author 1"));
    }
}
