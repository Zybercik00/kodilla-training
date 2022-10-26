package com.kodilla.universum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;


class UniversumApplicationTests {

    @Test
    void milkyWay() {
        Galaxy galaxy = new Galaxy("MilkyWay");
        Star sun = new RedGiant("Sun", 1889.4);
        Planet earth = new RockyPlanet("Earth", 59);
        Planet mercury = new RockyPlanet("Mercury", 3.2);
        Planet venus = new RockyPlanet("Venus", 48);
        Planet saturn = new RockyPlanet("Saturn", 5600);
        Planet jupiter = new RockyPlanet("Jupiter", 1800);
        Planet mars = new RockyPlanet("Mars", 6.4);
        Star syriusz = new RedGiant("Syriusz", 40000000);
        Star sn2016aps = new Supernova("SN2016aps", 200000000);

        sun.addPlanet(earth);
        sun.addPlanet(mercury);
        sun.addPlanet(venus);
        sun.addPlanet(saturn);
        sun.addPlanet(jupiter);
        sun.addPlanet(mars);
        galaxy.addStar(sun);
        galaxy.addStar(syriusz);
        galaxy.addStar(sn2016aps);
        galaxy.printGalaxy();

        Assertions.assertEquals(9406.0, sun.getTotalMass());
        Assertions.assertEquals(1252.766, sun.getAveragePlanetMass(), 0.01);
        Assertions.assertEquals(Set.of(saturn, jupiter), sun.getBiggerThan(earth));
        Assertions.assertEquals(Set.of(earth, venus, jupiter, saturn), sun.getBiggerThan(mars));
        Assertions.assertEquals(saturn, sun.getBiggestPlanet());
        Assertions.assertNull(sn2016aps.getBiggestPlanet());
    }

}
