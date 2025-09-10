package com.kodilla.MyExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToDoList {
    private List<String> listaZadan = new ArrayList<>();

    public void addTask(String tekst) {
        if (listaZadan.size()<10){
            listaZadan.add(tekst);
        } else {
            throw new IndexOutOfBoundsException("Lista jest już pełna, brak możliwości dodawania kolejnych zadań");
        }
    }

    public boolean removeTask(String tekst) {
       return listaZadan.remove(tekst);
    }

    public boolean ifTaskExists(String tekst) {
            return listaZadan.contains(tekst);
    }

    public List<String> getAllTasks(){
        return new ArrayList<>(listaZadan);
    }

    public void addAllTasks(List<String> tasks) {
        for (String task : tasks) {
            if (listaZadan.size() < 10) {
                listaZadan.add(task);
            } else {
                throw new IndexOutOfBoundsException("Lista jest już pełna, brak możliwości dodawania kolejnych zadań");
            }
        }
    }
}
