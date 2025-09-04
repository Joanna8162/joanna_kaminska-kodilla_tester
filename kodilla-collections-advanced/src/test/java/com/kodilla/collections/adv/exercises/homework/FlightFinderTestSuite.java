package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        List<Flight> result = new FlightFinder().findFlightsFrom("Madrid");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Madrid", "Athens"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        List<Flight> result = new FlightFinder().findFlightsTo("London");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Paris", "London"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsFrom_nonExistingCity() {
        List<Flight> result = new FlightFinder().findFlightsFrom("Tokyo");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindFlightsTo_nonExistingCity() {
        List<Flight> result = new FlightFinder().findFlightsTo("Maldives");
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindFlightsFrom_multipleResults() {
        List<Flight> result = new FlightFinder().findFlightsFrom("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warsaw"));
        expectedList.add(new Flight("Berlin", "Rome"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo_multipleResults() {
        List<Flight> result = new FlightFinder().findFlightsTo("Warsaw");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warsaw"));
        expectedList.add(new Flight("Tenerife", "Warsaw"));
        assertEquals(expectedList, result);
    }
}