package com.mucahitarslan;

import com.mucahitarslan.solid.*;

import java.util.List;

class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        List<Shape> shapes = List.of(
                circle,
                square,
                cube);
        int sum = areaCalculator.sum(shapes);

        ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.json(sum));
        System.out.println(printer.csv(sum));
    }

}