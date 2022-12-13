package com.mucahitarslan.solid.shape;


import com.mucahitarslan.solid.shape.Shape;

// When you should add a new Class, you can't write method in the other classes
// So, you have to create a interface for common method signature
// After that implement the interface in new class for the fill the method body
    public class Cube implements Shape {

    @Override
    public double area() {
        return 100;  // temporary for this example
    }
}
