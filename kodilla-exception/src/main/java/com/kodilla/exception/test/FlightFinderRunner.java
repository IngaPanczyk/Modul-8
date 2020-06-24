package com.kodilla.exception.test;

public class FlightFinderRunner {
    public static void main(String[] args) throws Exception {
        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("Kraków", "Katowice");
        try {
            flightFinder.findFlight(flight1);
        } catch (Exception e) {
            System.out.println("Brak lotniska w bazie");
        } finally {
            System.out.println("Wyszukiwanie zakończone");
        }
    }
}
