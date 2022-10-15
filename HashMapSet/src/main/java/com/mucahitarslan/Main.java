package com.mucahitarslan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap keyValue = new HashMap();
        keyValue.put("Türkiye" , "Ankara");
        keyValue.put("Fransa" , "Paris");
        keyValue.put("İngiltere", "Londra");

        Set set = keyValue.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext())
        {
            Map.Entry item = (Map.Entry) iterator.next();
            System.out.println(item.getKey() + " -> " + item.getValue());
        }

    }
}