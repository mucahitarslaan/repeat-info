package com.mucahitarslan.solid.calculator;

import com.mucahitarslan.solid.shape.Shape;

import java.util.List;


// The classes that implement this interface have to override to all methods
public interface IAreaCalculator {
    int sum(List<Shape> shapes);
}
