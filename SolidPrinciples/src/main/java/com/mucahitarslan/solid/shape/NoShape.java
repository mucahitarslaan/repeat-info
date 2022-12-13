package com.mucahitarslan.solid.shape;


import com.mucahitarslan.solid.shape.Shape;

// NoShape implements the Shape parent class !
// But, There is no calculate in NoShape class.
// So, we would break the Liskov Substitution Principle
public class NoShape implements Shape {
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area"); // temporary for this example
    }
}
