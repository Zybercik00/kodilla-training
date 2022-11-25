package com.kodilla.spring.intro;

import com.kodilla.spring.intro.shape.Circle;
import com.kodilla.spring.intro.shape.Drawer;
import com.kodilla.spring.intro.shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawerTest {

    @Test
    public void testDoDrawingWithCircle() {

        Circle circle = new Circle();

        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();


        assertEquals("This is a circle", result);
    }

    @Test
    public void testDoDrawingWithTriangle() {
        Triangle triangle = new Triangle();

        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();

        assertEquals("This is triangle", result);
    }
}
