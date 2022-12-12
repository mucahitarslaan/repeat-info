package com.mucahitarslan.solid;

import java.util.List;

//This class not in the AreaCalculator - If it were in AreaCalculator
//We would not abide by the Single Responsibility Principle ...
public class ShapesPrinter {
    public String json(int sum){
        return "{shapesSum : %s}".formatted(sum);
    }

    public String csv(int sum){
        return "shapes_sum,%s".formatted(sum);
    }
}
