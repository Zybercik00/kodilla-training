package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private static String shapeName = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle("+ radius + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}


// Wlasnosci pierwotne  -> promien
// Wlasnosci obliczalne -> pole (pole = PI * promien * promien)
// new Circle(5), new Circle(3)