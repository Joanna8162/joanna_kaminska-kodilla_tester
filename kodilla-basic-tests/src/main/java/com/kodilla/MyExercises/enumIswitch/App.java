package com.kodilla.MyExercises.enumIswitch;

import java.util.*;

public class App {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] descriptions = {
                "Nie działa drukarka",
                "Awaria internetu",
                "Błąd w systemie",
                "Zgłoszenie serwisowe",
                "Problem z logowaniem"
        };

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            String id = "TICKET-" + i;
            String description = descriptions[random.nextInt(descriptions.length)];
            Status status = Status.values()[random.nextInt(Status.values().length)];
            Ticket ticket = new Ticket(id, description, status);
            tickets.add(ticket);
        }

        for (Ticket ticket : tickets) {
            System.out.println(ticket.getId() + " | " + ticket.getStatus() + " | " + ticket.getAction());
        }

        boolean running = true;

        while (running) {
            System.out.println("\nLista zgłoszeń:");
            for (Ticket ticket : tickets) {
                ticket.printTicketInfo();
            }

            System.out.println("\nPodaj ID zgłoszenia do edycji lub wpisz 'exit' aby zakończyć:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                running = false;
                break;
            }

            Optional<Ticket> found = tickets.stream()
                    .filter(t -> t.getId().equalsIgnoreCase(input))
                    .findFirst();

            if (found.isPresent()) {
                Ticket selected = found.get();
                System.out.println("Aktualny status: " + selected.getStatus());
                System.out.println("Podaj nowy status (NEW, IN_PROGRESS, DONE):");

                String newStatusStr = scanner.nextLine().toUpperCase();

                try {
                    Status newStatus = Status.valueOf(newStatusStr);
                    selected.setStatus(newStatus);
                    System.out.println("Status zmieniony. Nowa akcja: " + selected.getAction());
                } catch (IllegalArgumentException e) {
                    System.out.println("Nieprawidłowy status. Dozwolone: NEW, IN_PROGRESS, DONE.");
                }
            } else {
                System.out.println("Nie znaleziono zgłoszenia o ID: " + input);
            }
        }

        System.out.println("\nProgram zakończony.");

    }
}