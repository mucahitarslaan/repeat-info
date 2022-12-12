package com.mucahitarslan.solid;


// When you should add a new Class, you can't write method in the other classes
// So, you have to create a interface for common method signature
// After that implement the interface in new class for the fill the method body
    public class Rectangle implements Shape{

    @Override
    public double area() {
        return 20;
    }
}
