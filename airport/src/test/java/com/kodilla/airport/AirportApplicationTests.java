package com.kodilla.airport;

import com.kodilla.airport.domain.AirPlane;
import com.kodilla.airport.domain.Flight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
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
        AirPlane airPlane = new AirPlane(1999,196,"Boeing","737");
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
        Duration duration = flight.flightDuration();
        String  capacity = flight.plainCapacity();
        System.out.println(duration.toString());
        System.out.println(flight);

        //Then

//        Assertions.assertEquals(PT-2H-5M, duration);
//        Assertions.assertTrue(true, capacity);

    }


}
