package com.qalabs.javabasics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main (String[] args) {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("Key1", "Value1");
        myMap.put("Key2", "Value2");
        for(Map.Entry<String, String> entry: myMap.entrySet()) {
            System.out.println(String.format("%s: %s", entry.getKey(), entry.getValue()));
        }
    }
}


