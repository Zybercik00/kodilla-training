package com.kodilla.airport;

import com.kodilla.airport.domain.AirPlane;
import com.kodilla.airport.domain.AirPort;
import com.kodilla.airport.domain.Flight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

class AirportApplicationTests {

    private static final Random RANDOM = new Random();

    @Test
    void contextLoads() {
    }

    @Test
    void testing() {
        AirPlane airPlane = new AirPlane(1999, 196, "Boeing", "737");
        airPlane.setOwner("British AirWays");
        System.out.println(airPlane);
        airPlane.changeSpeeds(280, 0);
        airPlane.changeTrajectory(120);
        System.out.println(airPlane);
        airPlane.changeSpeeds(280, 0);
        airPlane.changeTrajectory(0);
        System.out.println(airPlane);
    }

    @Test
    void testing2() {
        List<AirPlane> planes = IntStream.range(0, RANDOM.nextInt(5) + 1).mapToObj(i -> createDefaultRandomAirPlane()).toList();
        planes.forEach(plane -> plane.changeSpeeds(100, 0));

//        for (AirPlane plane : planes) {
//            plane.changeSpeeds(100, 0);
//        }
    }

    private AirPlane createDefaultRandomAirPlane() {
        AirPlane plane = new AirPlane(RANDOM.nextInt(30) + 1990, RANDOM.nextInt(20) + 190, "Boeing", "737");
        plane.setOwner("British Airways");
        plane.changeSpeeds(0, 0);
        plane.changeTrajectory(0);
        return plane;
    }

    @Test
    void testing3() {
        // given
        AirPlane airPlane = new AirPlane(2000, 320, "Boeing", "737");
        airPlane.setOwner("LOT");

        // when
        airPlane.changeSpeeds(300, 0);
        airPlane.changeTrajectory(180);

        // then
        Assertions.assertEquals(300, airPlane.getHorizontalSpeed());
        Assertions.assertEquals(0, airPlane.getClimbSpeed());

        // when
        airPlane.changeSpeeds(0, 100);

        // then
        Assertions.assertEquals(300, airPlane.getHorizontalSpeed());
        Assertions.assertEquals(100, airPlane.getClimbSpeed());

        // when
        airPlane.changeSpeeds(200, -50);

        // then
        Assertions.assertEquals(500, airPlane.getHorizontalSpeed());
        Assertions.assertEquals(50, airPlane.getClimbSpeed());

        // when
        airPlane.changeSpeeds(300, -50);

        // then
        Assertions.assertEquals(800, airPlane.getHorizontalSpeed());
        Assertions.assertEquals(0, airPlane.getClimbSpeed());

    }

    @Test
    void testing4() {
        //Given
        AirPlane plane = createDefaultRandomAirPlane();
        plane.setOwner("LOT");
        Flight flight = Flight.builder()
                .flightFrom("Warszawa")
                .flightTo("Berlin")
                .arrivalTime(LocalDateTime.of(2022, 10, 3, 11, 50, 0))
                .departureTime(LocalDateTime.of(2022, 10, 3, 9, 45, 0))
                .passengersCount(191)
                .flightIdentifier("LO55")
                .gate("C24")
                .plane(plane)
                .build();

        //When
        long duration = flight.getDurationInMinutes();
        boolean capacityOk = flight.isPlaneCapacity();

        //Then

        Assertions.assertEquals(125, duration);
        Assertions.assertTrue(capacityOk);

    }

    @Test
    void testing5() {
        //Given
        AirPlane lot = createLotPlane();
        AirPlane british = createBritishPlane();
        AirPlane swiss = createSwissPlane();
        AirPort airPort = AirPort.builder()
                .name("Warszawa Modlin")
                .code("MOD")
                .departures(List.of(
                        createFlight("RY101", "C01", "Rzym", "Warszawa Modlin", LocalDateTime.of(2022, 10, 2, 10, 50, 00), LocalDateTime.of(2022, 10, 2, 13, 5, 00), 150, lot),
                        createFlight("RY102", "C03", "Berlin", "Warszawa Modlin", LocalDateTime.of(2022, 10, 2, 11, 15, 00), LocalDateTime.of(2022, 10, 2, 12, 50, 00), 180, british)
                ))
                .arrivals(List.of(
                        createFlight("RY210", "C01", "Warszawa Modlin", "Amsterdam", LocalDateTime.of(2022, 10, 2, 14, 00, 00), LocalDateTime.of(2022, 10, 2, 16, 10, 00), 131, swiss),
                        createFlight("RY304", "C27", "Warszawa Modlin", "Bazylea", LocalDateTime.of(2022, 10, 14, 17, 00, 00), LocalDateTime.of(2022, 10, 14, 16, 10, 00), 131, swiss)
                ))

                .build();
        airPort.printDepartureTable();
        airPort.printArrivalTable();

    }

    private Flight createFlight(String id, String gate, String arrivalCity, String departureCity, LocalDateTime departureTime, LocalDateTime arrivalTime, int passengersCount, AirPlane plane) {
        return Flight.builder()
                .flightFrom(departureCity)
                .flightTo(arrivalCity)
                .arrivalTime(arrivalTime)
                .departureTime(departureTime)
                .passengersCount(passengersCount)
                .flightIdentifier(id)
                .gate(gate)
                .plane(plane)
                .build();
    }


    private AirPlane createLotPlane() {

        AirPlane airPlane1 = new AirPlane(2000, 800, "Airbus", "737");
        airPlane1.setOwner("LOT1");
        return airPlane1;
    }

    private AirPlane createBritishPlane() {
        AirPlane airPlane2 = new AirPlane(2020, 800, "Airbus", "747");
        airPlane2.setOwner("British");
        return airPlane2;
    }

    private AirPlane createSwissPlane() {
        AirPlane airPlane3 = new AirPlane(2000, 800, "Airbus", "000");
        airPlane3.setOwner("SWISS");
        return airPlane3;
    }

}
