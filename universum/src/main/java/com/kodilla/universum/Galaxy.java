package com.kodilla.universum;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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
        // TODO
        // Nazwa
        // Gwaizda1 -> planeta1, planeta2, planeta3 ...
        // Gwiazda 2 -> plneta1, planeta2 ...
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
