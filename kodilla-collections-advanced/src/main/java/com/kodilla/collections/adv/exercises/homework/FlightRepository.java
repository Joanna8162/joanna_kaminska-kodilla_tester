package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Berlin", "Warsaw"));
        flightList.add(new Flight("Paris", "London"));
        flightList.add(new Flight("Cracow", "Lisbon"));
        flightList.add(new Flight("Prague", "Palermo"));
        flightList.add(new Flight("Madrid", "Athens"));
        flightList.add(new Flight("Berlin", "Rome"));
        flightList.add(new Flight("Tenerife", "Warsaw"));
        return flightList;
    }
}
