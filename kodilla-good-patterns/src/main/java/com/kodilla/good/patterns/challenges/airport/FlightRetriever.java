package com.kodilla.good.patterns.challenges.airport;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightRetriever {

    private List<Flight> flightList = new LinkedList<>();

    public List<Flight> addFlight(Flight flight) {
        flightList.add(flight);
        return flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void searchDeparturesFlight(String departures) {
        List<Flight> listDepartures = flightList
                .stream()
                .filter(f -> f.getDepartures().equals(departures))
                .collect(Collectors.toList());

        if (listDepartures.size() == 0) {
            System.out.println("Nie wyszukano lotu " + departures);
        } else {
            listDepartures.stream()
                    .map(f -> "Departure: " + f.getDepartures()+ " " + "Arrival: " + f.getArrivals())
                    .forEach(System.out::println);
        }
    }
    public void searchArrivalsFlight(String arrivals) {
        List<Flight> listArrivals = flightList
                .stream()
                .filter(f -> f.getDepartures().equals(arrivals))
                .collect(Collectors.toList());


        if (listArrivals.size() == 0) {
            System.out.println("Nie wyszukano lotu " + arrivals);
        } else {
            listArrivals.stream()
                    .map(f -> "Departure: " + f.getDepartures() + " " + "Arrival: " + f.getArrivals())
                    .forEach(System.out::println);
        }
    }
}
