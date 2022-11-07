package com.kodilla.good.patterns.challenges.airport;


import java.util.Objects;

public class Flight {

    private String arrivals;
    private String departures;

    public Flight(String arrivals, String departures) {
        this.arrivals = arrivals;
        this.departures = departures;
    }

    public String getArrivals() {
        return arrivals;
    }

    public String getDepartures() {
        return departures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(arrivals, flight.arrivals) && Objects.equals(departures, flight.departures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrivals, departures);
    }

    @Override
    public String toString() {
        return " " +
                "arrival: '" + arrivals + '\'' +
                ", departure: '" + departures;
    }
}
