//package com.kodilla.good.patterns.challenges.airport;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class FlightSearchEngine implements FlightFinder{
//
//    @Override
//    public void searchDeparturesFlight(String departures) {
//        List<Flight> listDepartures = (new FlightRetriever())
//                .getFlightList().stream()
//                .filter(f -> f.getDepartures().equals(departures))
//                .collect(Collectors.toList());
//
//        if (listDepartures.size() == 0) {
//            System.out.println("Nie wyszukano lotu " + departures);
//        } else {
//            listDepartures.stream()
//                    .map(f -> "Departure: " + f.getDepartures()+ " " + "Arrival: " + f.getArrivals())
//                    .forEach(System.out::println);
//        }
//    }
//    @Override
//    public void searchArrivalsFlight(String arrivals) {
//        List<Flight> listArrivals = new FlightRetriever()
//                .getFlightList().stream()
//                .filter(f -> f.getDepartures().equals(arrivals))
//                .collect(Collectors.toList());
//
//        if (listArrivals.size() == 0) {
//            System.out.println("Nie wyszukano lotu " + arrivals);
//        } else {
//            listArrivals.stream()
//                    .map(f -> "Departure: " + f.getDepartures() + " " + "Arrival: " + f.getArrivals())
//                    .forEach(System.out::println);
//        }
//    }
//}
