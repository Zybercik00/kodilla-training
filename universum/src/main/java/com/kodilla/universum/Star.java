package com.kodilla.universum;

import lombok.Getter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public abstract class Star implements CelestialBody {

    private String name;
    private double mass;
    private Set<Planet> planets;

    public Star(String name, double mass) {
        this.name = name;
        this.mass = mass;
        this.planets = new HashSet<>();
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public double getTotalMass() {
        return mass + planets.stream()
                .mapToDouble(planet -> planet.getMass())
                .sum();
    }

    public double getAveragePlanetMass() {
        return planets.stream()
                .mapToDouble(p -> p.getMass())
                .average()
                .orElse(0);
    }

    public Planet getBiggestPlanet() {
        return planets.stream()
                .max((p1, p2) -> p1.getMass() >= p2.getMass() ? 1 : -1)
                .orElse(null);
    }

    public Set<Planet> getBiggerThan(Planet planet) {
        return planets.stream()
                .filter(planet1 -> planet1.getMass() > planet.getMass())
                .collect(Collectors.toSet());

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMass() {
        return mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return Double.compare(star.mass, mass) == 0 && Objects.equals(name, star.name) && Objects.equals(planets, star.planets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mass, planets);
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", planets=" + planets +
                '}';
    }
}
