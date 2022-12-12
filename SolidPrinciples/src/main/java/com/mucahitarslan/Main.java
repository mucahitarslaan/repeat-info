package com.mucahitarslan;

import com.mucahitarslan.solid.*;

import java.util.List;

class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorv2 = new AreaCalculatorv2(); // just a few changes

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        ShapesPrinter printer = new ShapesPrinter(areaCalculatorv2); // just a few changes
        List<Shape> shapes = List.of(
                circle,
                square,
                cube);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }

}