package com.mucahitarslan.solid.interfaceSegregation;


// Böyle bir yapı okunabilirliği azaltır. Gerek duyulmayan metotları
// implement etmek zorunda kaldık ve bakımı zor bir hal almış oldu
// Burada yapılması gereken; her temel özelliğe ayrı bir interface yaratarak
// Interface Segregation sınıfına uygun hale getirmektir.
public class WithinPrinciple {
    public interface Flyable {
        void fly();
    }
    public interface Runnable {
        void run();
    }
    public interface Barkable {
        void bark();
    }

    public class Bird implements Flyable, Runnable {
        public void run() {
            System.out.println("Kuş,Koşuyorum");
            //logic
        }
        public void fly() {
            System.out.println("Kuş, Uçuyorum.");
            //logic
        }
    }
// Böylece her yeni özellik için bir interface daha yazarak, özelliği barındıran sınıflara implement edebiliriz.
// Her sınıf, her hayvan kendi yapabildiği özelliği implement ederek, ihtiyaç duymadığı özelliklerden arındırılmış oldu.
// Kod okunurluğu artarken, esneklikte kazandırmış olduk.
    public class Cat implements Runnable {
        public void run() {
            System.out.println("Kedi,Koşuyorum");
            //logic
        }
    }

    public class Dog implements Runnable, Barkable {
        public void bark() {
            System.out.println("Köpek,Havlıyorum.");
            //logic
        }
        public void run() {
            System.out.println("Köpek,Koşuyorum.");
            //logic
        }
    }
}
