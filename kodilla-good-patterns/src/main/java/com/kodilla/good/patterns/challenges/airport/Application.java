package com.kodilla.good.patterns.challenges.airport;

public class Application {

    public static void main(String[] args) {

        FlightRetriever flightRetriever = new FlightRetriever();
        flightRetriever.addFlight(new Flight("Warszawa", "Krakow"));
        flightRetriever.addFlight(new Flight("Krakow", "Warszawa"));
        flightRetriever.addFlight(new Flight("Warszawa", "Gdansk"));
        flightRetriever.searchArrivalsFlight("Warszawa");
        flightRetriever.searchDeparturesFlight("Warszawa");


    }
}
