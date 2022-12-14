package com.mucahitarslan.solid.openClosed;

import java.util.List;

public class AgainstThePrinciple {
    public class Rectangle {
        private double length;
        private double height;

        public double getLength() {
            return length;
        }

        public double getHeight() {
            return height;
        }
    }

    public class AreaService {

        public double calculateArea(List<Rectangle> shapes) {
            double area = 0;
            for (Rectangle rect : shapes) {
                area += (rect.getLength() * rect.getHeight());
            }
            return area;
        }
    }

    //Circle eklediğimi düşünelim.

    public class Circle {
        private double radius;

        public double getRadius() {
            return radius;
        }
    }

    // AreaService içerisinde değişiklik yapmak durumunda olacağız
    // Bu durumda AreaService class'ı karışacak
    // Circle yanında farklı bir şey daha eklesek, kod daha da spagettiye dönecek
    public class AreaServicev2 {
        public double calculateArea(List<Object>... shapes) {
            double area = 0;
            for (Object shape : shapes) {
                if (shape instanceof Rectangle) {
                    Rectangle rect = (Rectangle) shape;
                    area += (rect.getLength() * rect.getHeight());
                } else if (shape instanceof Circle) {
                    Circle circle = (Circle) shape;
                    area += circle.getRadius() * circle.getRadius() * Math.PI;
                } else {
                    throw new RuntimeException("Shape not supported");
                }
            } return area;
        }
    }


}
