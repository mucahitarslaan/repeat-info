package com.mucahitarslan.solid.liskovSubstitution;

public class WithinPrinciple {

//  Kare bir şekildir o halde Square adlı bir sınıf yaratarak Shape’den implement edebiliriz.
    public interface Shape {
        long area();
    }

    public class Square implements Shape {
        private int size;
        public Square(int size) {
            this.size = size;
        }
        @Override
        public long area() {
            return size * size;
        }
        public void setSize(int size) {
            this.size = size;
        }
    }

//  Dikdörtgen Kare ile farklı davranışlar gösterebiliyor o halde onu ayrı bir şekil olarak Rectangle
//  adlı bir sınıf yaratıp Shape’den implement edebiliriz.

    public class Rectangle implements Shape {
        private int width;
        private int height;
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        @Override
        public long area() {
            return width * height;
        }
        public void setWidth(int width) {
            this.width = width;
        }
        public void setHeight(int height) {
            this.height = height;
        }
    }

//  Artık Kare ve Dikdörtgen kendi davranışlarına sahip oldu. Ve her biri ayrı şekil olarak kabul ediliyor.
//  Böylece alan hesaplama her bir şekile özgü matematiksel bir işlem içerebiliyor.
/*
    @Test
    public void testRectangleArea() throws Exception {
        Shape rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.area());
    }
    @Test
    public void testSquareArea() throws Exception {
        Shape square = new Square(5);
        assertEquals(25, square.area());
    }
 */

}
