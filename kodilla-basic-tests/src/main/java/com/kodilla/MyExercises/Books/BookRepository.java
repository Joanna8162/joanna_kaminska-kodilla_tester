package com.kodilla.MyExercises.Books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository {

    private Map<String, List<Book>> authorsBookList = new HashMap<>();

    public List<Book> getBooksByAuthorStream(String author) {
        return authorsBookList.entrySet().stream()
                .filter(entry -> entry.getKey().toLowerCase().contains(author.toLowerCase()))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(new ArrayList<>());
    }

    public List<Book> getBooksByAuthorGet(String author) {
        return authorsBookList.getOrDefault(author, new ArrayList<>());
    }

    public void addBook(String author, Book book) {
        authorsBookList.putIfAbsent(author, new ArrayList<>());
        authorsBookList.get(author).add(book);
    }

    public Map<String, List<Book>> getAuthorsBookList() {
        return authorsBookList;
    }
}