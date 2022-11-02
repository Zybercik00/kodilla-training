package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Gdansk", true);
        flights.put("Berlin", false);
        flights.put("Amsterdam", true);


        Boolean result = flights.get(flight.getArrivalAirport());
        if (result != null) {
            return result;
        } else {
            throw new RouteNotFoundException();
        }
    }
}
