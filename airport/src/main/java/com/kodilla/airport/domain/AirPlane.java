package com.kodilla.airport.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
//@Builder
@Getter
@Setter
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

//    public AirPlane createPlane() {
//        return  new AirPlane(year, seats, brand, model);
//    }


    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void changeSpeeds(int deltaHorizontal, int deltaVertical) {
        horizontalSpeed = horizontalSpeed + deltaHorizontal;
        climbSpeed = climbSpeed + deltaVertical;
    }

    public void changeTrajectory(int trajectory) {
        this.trajectory = trajectory;
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
        return "AirPlane{" +
                "year=" + year +
                ", seats=" + seats +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", owner='" + owner + '\'' +
                ", climbSpeed=" + climbSpeed +
                ", horizontalSpeed=" + horizontalSpeed +
                ", trajectory=" + trajectory +
                '}';
    }
}
