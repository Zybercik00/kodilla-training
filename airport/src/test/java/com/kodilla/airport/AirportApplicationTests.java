package com.kodilla.airport;

import com.kodilla.airport.domain.AirPlane;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@SpringBootTest
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
        airPlane.start(280,120);
        System.out.println(airPlane);
        airPlane.land();
        System.out.println(airPlane);
    }

    @Test
    void testing2() {
        int planesCount = RANDOM.nextInt(5) + 1;
        List<AirPlane> planes = new ArrayList<>();
        for (int i = 0; i < planesCount; i++) {
            AirPlane plane = new AirPlane(RANDOM.nextInt(30) + 1990, RANDOM.nextInt(20) + 190, "Boeing", "737");
            plane.setOwner("British Airways");
            plane.start(280, 120);
            planes.add(plane);
        }

        for (AirPlane plane: planes) {   // for each
            System.out.println(plane);
        }
    }

}
