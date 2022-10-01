package com.kodilla.airport.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Builder
public class Flight {
    // skad, dokad, ilu pasazerow, godzina startu i ladowania (wedlug planu), identyfikator lotu (np. LO55), gate, samolot ktory realizuje lot
    // Metoda, ktora obliczy dlugosc lotu
    // Metoda, ktora sprawdzi (validate), czy dany samolot moze obsluzyc ten lot (liczba pasazerow)

    private String flightFrom;
    private String flightTo;
    private int passengersCount;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private String flightIdentifier;
    private String gate;
    private AirPlane plane;

    public Duration flightDuration() {
        Duration duration = Duration.between(getArrivalTime(), getDepartureTime());
        return duration;
    }

    public String plainCapacity () {
        boolean capacityOk = true;
        if(capacityOk == plane.getSeats() >= passengersCount) {
            System.out.println("There is enough place in plane");
        } else {
            System.out.println("There is NOT enough place in plane");
        }
        return null;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return passengersCount == flight.passengersCount && Objects.equals(flightFrom, flight.flightFrom) && Objects.equals(flightTo, flight.flightTo) && Objects.equals(arrivalTime, flight.arrivalTime) && Objects.equals(departureTime, flight.departureTime) && Objects.equals(flightIdentifier, flight.flightIdentifier) && Objects.equals(gate, flight.gate) && Objects.equals(plane, flight.plane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo, passengersCount, arrivalTime, departureTime, flightIdentifier, gate, plane);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", flightTo='" + flightTo + '\'' +
                ", passengersCount=" + passengersCount +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", flightIdentifier='" + flightIdentifier + '\'' +
                ", gate='" + gate + '\'' +
                ", plane=" + plane +
                '}';
    }

}

