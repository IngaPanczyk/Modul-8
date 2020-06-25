package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws Exception {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Kraków", true);
        airports.put("Moskwa", true);
        if (airports.containsValue(flight.getArrivalAirport()) && airports.containsValue(flight.getDepartureAirport())) {
            airports.get(flight.getArrivalAirport());
            airports.get(flight.getDepartureAirport());
        }else {
            throw new FlightFinderException();
        }
            return true;
    }
}
