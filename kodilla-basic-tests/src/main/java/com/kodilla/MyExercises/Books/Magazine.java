package com.kodilla.MyExercises.Books;

import java.util.List;

public class Magazine extends Publication implements Readable {
    public Magazine(String title, int year) {
        super(title, year);
    }

    List<String> magazinnesAuthors;

    @Override
    public void read() {
        System.out.println("Aktualnie czytam: " + getTitle() + ", " + getYear());
    }
}
