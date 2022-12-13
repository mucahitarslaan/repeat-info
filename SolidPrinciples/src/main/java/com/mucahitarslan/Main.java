package com.mucahitarslan;

import com.mucahitarslan.solid.calculator.AreaCalculator;
import com.mucahitarslan.solid.calculator.AreaCalculatorv2;
import com.mucahitarslan.solid.calculator.IAreaCalculator;
import com.mucahitarslan.solid.printer.ShapesPrinter;
import com.mucahitarslan.solid.shape.*;

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