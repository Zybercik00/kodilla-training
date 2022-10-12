package com.kodilla.universum;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


class UniversumApplicationTests {

    @Test
    void milkyWay() {
        Galaxy galaxy = new Galaxy("MilkyWay");
        Star sun = new RedGiant("Sun", 200);
        Planet earth = new RockyPlanet("Earth", 100);
        Planet mercury = new RockyPlanet("Mercury", 300);
        Planet venus = new RockyPlanet("Venus", 400);
        Planet saturn = new RockyPlanet("Saturn", 500);
        Planet jupiter = new RockyPlanet("Jupiter", 600);
        Planet mars = new RockyPlanet("Mars", 600);


        sun.addPlanet(earth);
        sun.addPlanet(mercury);
        sun.addPlanet(venus);
        sun.addPlanet(saturn);
        sun.addPlanet(jupiter);
        sun.addPlanet(mars);
        galaxy.addStar(sun);
        System.out.println(galaxy);

        System.out.println(sun.getTotalMass());
        System.out.println(sun.getAverygPlanetMass());
        System.out.println(sun.getBiggestPlanet());
        System.out.println(sun.getBiggerThan(earth));



        // TODO
        // zrob uklad sloneczny: Slonce -> Merkury, Wenus, Ziemia, Mars, Jowissz, Saturn ...
        // dodaj jeszcze ze dwie gwiazdy ...
        // wydrukuj galaktyke
        // wydrukuj calkowita mase galaktyki
        // Przetestować metody
    }

}
