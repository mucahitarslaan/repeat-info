package com.mucahitarslan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int sayi1 = 10; // sayi1 değişkenine 10 değerinin atamasını yaptık
        int sayi2 = 20; // sayi2 değişkenine 20 değerinin atamasını yaptık

        sayi2 = sayi1;  // sayi1'in değerini sayi2'ye atadık
        sayi1 = 30;     // sayi1 değişkenine 30 değerini atadık

        System.out.println("Sayi1: " + sayi1); //OUTPUT : 30
        System.out.println("Sayi2: " + sayi2); //OUTPUT : 10


        int[] sayilar1 = new int[]{1, 2, 3};    //sayilar1 isimli bir array oluşturdum
        int[] sayilar2 = new int[]{15, 20, 25}; //sayilar2 isimli bir array oluşturdum

        System.out.println(sayilar1);
        sayilar1 = sayilar2;  //sayilar2'nin adresini sayilar1'e atadık
        sayilar2[0] = 9;      //sayilar2'nin ilk indexine 9 değerini atadık
        System.out.println(sayilar1);
        System.out.println(sayilar1[0]);  //OUTPUT : 9

        // Burada dikkat edilmesi gereken bir husus var.
        // Sayilar2'nin 0. indexine atama yapıldığında, yeni bir
        // referans adresi oluşur. Heap üzerinde oluşan yeni referans
        // adresi tutulur. Diğerleri de Garbage Collector ile temizlenir

    }
}

