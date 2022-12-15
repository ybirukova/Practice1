package com.example.practice1.lesson13;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        String s = null;

        Optional<String> opt = Optional.ofNullable(s);
        boolean optNotNull = opt.isPresent();
        System.out.println("s is not null? = " + optNotNull);
    }
}