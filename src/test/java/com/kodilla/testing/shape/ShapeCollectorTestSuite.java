package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {


    @Test
    void testAddFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(new Circle(2.5));

        //then
        Shape shape = shapeCollector.getFigure(0);
        Assertions.assertEquals(new Circle(2.5), shape);
    }

    @Test
    void testRemoveFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3.4));
        shapeCollector.addFigure(new Square(5.0));
        shapeCollector.addFigure(new Triangle(5.0, 4.0));

        //when
        shapeCollector.removeFigure(new Square(5.0));

        //then
        String result = shapeCollector.showFigures();
        Assertions.assertEquals("Circle(3.4),Triangle(5.0,4.0)", result);
    }

    @Test
    void testgetFigure() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3.4));
        shapeCollector.addFigure(new Square(5.0));
        shapeCollector.addFigure(new Triangle(5.0, 4.0));

        //when

        Shape shape = shapeCollector.getFigure(1);

        //then

        Assertions.assertEquals(new Square(5.0), shape);

    }

    @Test
    void testshowFigures() {
        //given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(3.4));
        shapeCollector.addFigure(new Square(5.0));
        shapeCollector.addFigure(new Triangle(5.0, 4.0));
        shapeCollector.addFigure(new Circle(3.4));
        shapeCollector.addFigure(new Square(5.0));
        shapeCollector.addFigure(new Triangle(5.0, 4.0));

        //when
        String result = shapeCollector.showFigures();

        //then
        Assertions.assertEquals("Circle(3.4),Square(5.0),Triangle(5.0,4.0),Circle(3.4),Square(5.0),Triangle(5.0,4.0)",result);


    }

}
