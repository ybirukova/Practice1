package com.example.practice1.lesson12;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String, Product> toys = new HashMap<>();
        toys.put("car", new Product("train", 22));
        toys.put("doll", new Product("Doll Rose", 10));
        toys.put("box", new Product("Magic box", 5));

        printKeysValues(toys);
        printKeys(toys);
        printValues(toys);
    }

    static void printKeysValues(HashMap<String, Product> hashmap) {
        System.out.println("Key - value:");
        for (Map.Entry<String, Product> item : hashmap.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue().name + " " + item.getValue().price);
        }
    }

    static void printKeys(HashMap<String, Product> hashmap) {
        System.out.println("Keys:");
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    static void printValues(HashMap<String, Product> hashmap) {
        System.out.println("Values:");
        for (Product product : hashmap.values()) {
            System.out.println(product.name + " " + product.price);
        }
    }
}