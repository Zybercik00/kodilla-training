package com.kodilla.airport.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Getter
@Builder
public class AirPort {
    private String name;
    private String code;
    private List<Flight> arrivals;
    private List<Flight> departures;

    public void printDepartureTable() {
        printHeader(false);
        departures.forEach(flight -> printFlight(flight, false));
        printFooter();
    }

    public void printArrivalTable() {
        printHeader(true);
        arrivals.forEach(flight -> printFlight(flight, true));
        printFooter();
    }

    private void printHeader(boolean isArrival) {
        System.out.println(isArrival ? "Arrivals" : "Departures");    // ternary operator czyli skrocony zapis ifa
        System.out.println("*********************************************************************");
        System.out.println("number\t\t\t" + (isArrival ? "from" : "to") + "\t\t\t\tgate\t\ttime\t\tAirline");
        System.out.println("*********************************************************************");
    }

    private void printFooter() {
        System.out.println("*********************************************************************\n\n");
    }

    private void printFlight(Flight flight, boolean isArrival) {
            System.out.println(flight.getFlightIdentifier() + "\t\t\t" + (isArrival ? flight.getFlightFrom() : flight.getFlightTo()) + "\t\t\t" + flight.getGate() + "\t\t\t" + flight.getDepartureTime().toLocalTime() + "\t\t" + flight.getPlane());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPort airPort = (AirPort) o;
        return Objects.equals(name, airPort.name) && Objects.equals(code, airPort.code) && Objects.equals(arrivals, airPort.arrivals) && Objects.equals(departures, airPort.departures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, arrivals, departures);
    }

    @Override
    public String toString() {
        return "AirPort{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", arrivals=" + arrivals +
                ", departures=" + departures +
                '}';
    }
}
