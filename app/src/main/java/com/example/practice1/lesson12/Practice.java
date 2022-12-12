package com.example.practice1.lesson12;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("two", 2);
        Integer twoNumber = hashmap.put("two", 5);
        Integer value = hashmap.get("two");
        hashmap.values();

        Set<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.contains(1);
        for (Integer someNumber : hashset) {
            System.out.println(someNumber);
        }
    }
}
