package com.kodilla.universum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Galaxy implements CelestialBody {

    private String name;
    private Set<Star> stars;

    public Galaxy(String name) {
        this.name = name;
        this.stars = new HashSet<>();
    }

    public void addStar(Star star) {
        stars.add(star);
    }

    public void printGalaxy() {

//        String print = String.format("Nazwa galaktyki: %s\nGwiazda galaktyki: %s \nPlanety układu: %s", name, stars.stream().map(star -> star.getName()).collect(Collectors.toSet()), stars.stream().map(star -> star.getName()).collect(Collectors.joining(", ")));
//        System.out.println(print);
        String print = "Nazwa galaktyki: " + name;
        System.out.println(print);
        for (Star star : stars) {
            System.out.println("Gwiazda galaktyki: " + star.getName());
            if (!star.getPlanets().isEmpty()) {
                System.out.println("Planety układu: " + star.getPlanets().stream().map(planet -> planet.getName()).collect(Collectors.joining(", ")));
            } else {
                System.out.println("Brak planet");
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMass() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Galaxy galaxy = (Galaxy) o;
        return Objects.equals(name, galaxy.name) && Objects.equals(stars, galaxy.stars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stars);
    }

    @Override
    public String toString() {
        return "Galaxy{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                '}';
    }
}
