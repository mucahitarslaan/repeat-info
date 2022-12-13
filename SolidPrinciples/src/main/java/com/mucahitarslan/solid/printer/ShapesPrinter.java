package com.mucahitarslan.solid.printer;

import com.mucahitarslan.solid.calculator.IAreaCalculator;
import com.mucahitarslan.solid.shape.Shape;

import java.util.List;

//This class not in the AreaCalculator - If it were in AreaCalculator
//We would not abide by the Single Responsibility Principle ...

public class ShapesPrinter {
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{shapesSum : %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shapes_sum,%s".formatted(areaCalculator.sum(shapes));
    }
}





// We will inject the interface in this class for dependency principle
// So, the updated code is as above
/*

public class ShapesPrinter {
    private AreaCalculator areaCalculator = new AreaCalculator();
    public String json(List<Shape> shapes){
        return "{shapesSum : %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shapes_sum,%s".formatted(areaCalculator.sum(shapes));
    }
}

 */
