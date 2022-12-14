package com.mucahitarslan.solid.openClosed;

// AreaService tüm şekil tiplerinin alan hesabını yapmakla yükümlü ancak her alanın da
// kendine özgü bir hesaplama yöntemi mevcut, bu cümleden de anlaşılacağı üzere her şekil
// için farklı hesaplama yöntemi, her şekil için kendi içlerinde hesaplama gerekliliğini doğurmaktadır.


// Bunu çözmek için bir Shape interface’imiz olsa ve her bir şekil için hesaplanmış area’yı dönse nasıl olur ?
// Bunu yapmakla object tipinden de kendi bildiğimiz bir nesneye geçiş sağlamış olacağız.

import java.util.List;

public class WithinPrinciple {
    public interface Shape {
        double getArea();
    }

    public class Rectangle implements Shape {
        private double length;
        private double height;

        // getters/setters …
        @Override
        public double getArea() {
            return (length * height);
        }
    }

    public class Circle implements Shape {
        private double radius;

        // getters/setters …
        @Override
        public double getArea() {
            return (radius * radius * Math.PI);
        }
    }

//  Artık programımız Open/Closed prensibine uygun hale gelmiştir. Herhangi bir yeni şekil alanı hesaplamamız
//  gerektiğinde yapmamız gereken AreaService üzerinde değişiklik değil, ki değişikliğe kapalı olmalıyız.
//  Shape nesnemizden yeni şekli türetmemiz ve alan hesabını kendi içinde yapmamızdır. Böylece genişlemeye
//  açık oluyoruz ve hiç bi yerde değişikllik yapmamıza gerek kalmıyor.
    public class AreaManager {
        public double calculateArea(List<Shape> shapes) {
            double area = 0;
            for (Shape shape : shapes) {
                area += shape.getArea();
            }
            return area;
        }
    }
}
