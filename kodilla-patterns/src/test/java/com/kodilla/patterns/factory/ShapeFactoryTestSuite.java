package com.kodilla.patterns.factory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE);

        assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea(), 0);
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    void testFactorySquer() {
        ShapeFactory factory = new ShapeFactory();
        Shape square = factory.makeShape(ShapeFactory.SQUARE);

        assertEquals(28, square.getCircumference(), 0);
        assertEquals("The angular square", square.getName());
    }

    @Test
    void testFactoryRectangle() {
        ShapeFactory factory = new ShapeFactory();
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE);

        assertEquals(37.50, rectangle.getArea(), 0);
        assertEquals("The long rectangle", rectangle.getName());
    }
}
