package com.kodilla.exception.test;

public class FlightApplication {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("Warszawa", "Wrocław"));
        } catch (Exception e) {
            System.out.println("You can not flihgt to this place");
        }
        FlightFinder flightFinder2 = new FlightFinder();
        try {
            flightFinder2.findFlight(new Flight("Warszawa", "Berlin"));
        } catch (Exception e) {
            System.out.println("Faill");
        }

    }
}
