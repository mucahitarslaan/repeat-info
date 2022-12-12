package com.mucahitarslan;

import com.mucahitarslan.solid.AreaCalculator;
import com.mucahitarslan.solid.Circle;
import com.mucahitarslan.solid.ShapesPrinter;
import com.mucahitarslan.solid.Square;

import java.util.List;

class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        List<Object> shapes = List.of(circle,square);
        int sum = areaCalculator.sum(shapes);

        ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }
}