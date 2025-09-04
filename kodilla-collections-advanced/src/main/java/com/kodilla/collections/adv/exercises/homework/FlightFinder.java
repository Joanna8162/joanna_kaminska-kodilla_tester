package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightListFrom = new ArrayList<>();
        for (Flight f : FlightRepository.getFlightsTable()) {
            if (f.getDeparture().equals(departure)) {
                flightListFrom.add(f);
            }
        }
        return flightListFrom;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightListTo = new ArrayList<>();
        for (Flight f : FlightRepository.getFlightsTable()) {
            if (f.getArrival().equals(arrival)) {
                flightListTo.add(f);
            }
        }
        return flightListTo;
    }
}