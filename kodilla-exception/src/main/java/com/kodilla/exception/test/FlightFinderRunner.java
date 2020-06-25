package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) throws Exception {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Kraków", "Moskwa");
        try {
            flightFinder.findFlight(flight1);
            System.out.println("Wyszukano połączenie z: "+ flight1.getDepartureAirport() + "do" + flight1.getArrivalAirport());
        } catch (Exception e) {
            System.out.println("Brak połączenia");
        } finally {
            System.out.println("Wyszukiwanie zakończone");
        }
    }
}
