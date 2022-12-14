package com.mucahitarslan.solid.interfaceSegregation;

public class AgainstThePrinciple {
    public interface Animal {
        void fly();
        void run();
        void bark();
    }

// Kuşlar uçar ve koşar, ancak havlayamazlar diye varsayabiliriz . Havlamayı boşuna implement etmiş olduk.
    public class Bird implements Animal {
        public void bark() {
            /* do nothing */
        }
        public void run() {
            System.out.println("Koşan kuş");
        }
        public void fly() {
            System.out.println("Uçan kuş");
        }
    }

// Kediler koşar, ama uçup, havlayamazlar. Havlamayı kedi için boşuna implement etmiş olduk.
    public class Cat implements Animal {
        public void fly() {
            /* do nothing */
        }
        public void bark() {
            /* do nothing */
        }
        public void run() {
            System.out.println("Koşan kedi");
            // logic
        }
    }


}
