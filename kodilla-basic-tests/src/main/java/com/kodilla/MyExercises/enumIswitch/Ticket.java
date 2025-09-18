package com.kodilla.MyExercises.enumIswitch;

import static com.kodilla.MyExercises.enumIswitch.Status.*;

public class Ticket {

    String id;
    String description;
    Status status;

    public Ticket(String id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getAction()  {

        return switch (status) {
              case NEW -> "Przypisz do pracownika";
              case IN_PROGRESS -> "W trakcie realizacji";
              case DONE -> "Zamknij zgłoszenie";
          };
    }

    public void printTicketInfo() {
        System.out.println("ID: " + id + " | Opis: " + description + " | Status: " + status + " | Akcja: " + getAction());
    }

    public void setStatus(Status newStatus) {
    }
}
