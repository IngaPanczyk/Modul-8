package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws Exception {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Kraków", false);
        airports.put("Moskwa", true);
        try {
            airports.get(flight.getArrivalAirport());
            airports.get(flight.getDepartureAirport());
            System.out.println(airports.containsValue(flight.getArrivalAirport()));
            System.out.println(airports.containsValue(flight.getDepartureAirport()));
            System.out.println("Lot jest dostępny");
        } catch (Exception exception) {
            throw new FlightFinderException();
        } finally {
            System.out.println("Wyszukiwanie zakończone");
        }
    }
}
