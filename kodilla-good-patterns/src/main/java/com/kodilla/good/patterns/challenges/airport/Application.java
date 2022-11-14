package com.kodilla.good.patterns.challenges.airport;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightRetriever flightRetriever = new FlightRetriever();
        flightRetriever.addFlight(new Flight("Warszawa", "Krakow"));
        flightRetriever.addFlight(new Flight("Krakow", "Warszawa"));
        flightRetriever.addFlight(new Flight("Warszawa", "Gdaqsk"));
        flightRetriever.addFlight(new Flight("Gdansk", "Warszawa"));

        List<Flight> arrivalSearcher = flightRetriever.searchArrivalsFlight("Krakow");
        List<Flight> departuresSearcher = flightRetriever.searchDeparturesFlight("Gdansk");

        if (departuresSearcher == null || arrivalSearcher == null) {
            System.out.println("No Flight");
        }

        System.out.println("Flight searcher");
        System.out.println("**************************************************************");
        System.out.println("Arrivals: " + arrivalSearcher);
        System.out.println("**************************************************************");
        System.out.println("Departures: " + departuresSearcher);

    }
}
