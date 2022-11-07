package com.kodilla.good.patterns.challenges.airport;

import java.util.LinkedList;
import java.util.List;

public class FlightRetriever {

    private List<Flight> flightList = new LinkedList<>();

    public List<Flight> addFlight(Flight flight) {
        flightList.add(flight);
        return flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public List<Flight> searchDeparturesFlight(String departures) {
        List<Flight> listDepartures = flightList
                .stream()
                .filter(f -> f.getDepartures().equals(departures))
                .toList();

        if (listDepartures.size() == 0) {
            System.out.println("Nie wyszukano lotu " + departures);
        }

        return listDepartures;
    }

    public List<Flight> searchArrivalsFlight(String arrivals) {
        List<Flight> listArrivals = flightList
                .stream()
                .filter(f -> f.getArrivals().equals(arrivals))
                .toList();

        if (listArrivals.size() == 0) {
            System.out.println("Nie wyszukano lotu " + arrivals);
        }

            return listArrivals;
    }
}
