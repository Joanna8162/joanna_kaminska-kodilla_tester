package com.kodilla.MyExercises.Books;

import java.util.List;
import java.util.Objects;

public class Book extends Publication implements Readable {
    public Book(String title, int year) {
        super(title, year);
    }

    List<String> booksAuthors;

    @Override
    public void read() {
        System.out.println("Aktualnie czytam: " + getTitle() + ", " + getYear());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(booksAuthors, book.booksAuthors);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(booksAuthors);
    }
}
