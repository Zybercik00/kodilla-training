package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";

    public final Task doSomething(final String what) {
        switch (what) {
            case PAINTING: return new PaintingTask("Paint", "black", "wall", true);
            case SHOPPING: return new ShoppingTask("Go shopping", "beer", 2.0, true);
            case DRIVING: return new DrivingTask("Drive to shop", "To shop", "Car", true);
            default: return null;
        }
    }
}
