package com.kodilla.airport.domain;

import java.util.Objects;

public class AirPlane {

    private final int year;
    private final int seats;
    private final String brand;
    private final String model;
    private String owner;
    private int climbSpeed;
    private int horizontalSpeed;
    private int trajectory;

    public AirPlane(int year, int seats, String brand, String model) {
        this.year = year;
        this.seats = seats;
        this.brand = brand;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public int getSet() {
        return seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setClimbSpeed(int climbSpeed) {
        this.climbSpeed = climbSpeed;
    }

    public void setHorizontalSpeed(int horizontalSpeed) {
        this.horizontalSpeed = horizontalSpeed;
    }

    public void setTrajectory(int trajectory) {
        this.trajectory = trajectory;
    }

    public void start(int speed, int trajectory) {
        this.horizontalSpeed = speed;
        this.trajectory = trajectory;
    }

    public void land() {
        this.horizontalSpeed = 0;
        this.trajectory = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return year == airPlane.year && seats == airPlane.seats && climbSpeed == airPlane.climbSpeed && horizontalSpeed == airPlane.horizontalSpeed && trajectory == airPlane.trajectory && Objects.equals(brand, airPlane.brand) && Objects.equals(model, airPlane.model) && Objects.equals(owner, airPlane.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, seats, brand, model, owner, climbSpeed, horizontalSpeed, trajectory);
    }

    @Override
    public String toString() {
        return "AirPlane: " +
                "year: " + year +
                ", seats: " + seats +
                ", brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", owner: " + owner + '\'' +
                ", climbSpeed: " + climbSpeed +
                ", horizontalSpeed: " + horizontalSpeed +
                ", trajectory: " + trajectory;
    }
}
