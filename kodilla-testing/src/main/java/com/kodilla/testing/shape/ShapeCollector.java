package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes;

    public ShapeCollector() {
        this.shapes = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        return shapes.get(n);
    }

    public String showFigures() {
        String result = "";
        for (Shape shape : shapes) {
            if (result.equals("")) {
                result = result + shape;
            } else {
                result = result + "," + shape;
            }

        }
        return result;
    }
}


// "Circle(4),Triangle(2, 5),Square(5),Circle(3.5)"


// Collection  -> List (zachowuje kolejnosc, ale mozna przechowywac duplikaty) -> ArrayList (po indexie)          [1][2][5][6]   /// 1000000   60000
//                                                                             -> LinkedList                       1  <----> 2  <----> 5 <----> 10 <-----> 6 <----> 3
//             -> Set  (nie zachowuje kolejnosci, nie pozwala na duplikaty)    -> HashSet
// Map -> HashMap
// Stos, Kolejka (Queue)