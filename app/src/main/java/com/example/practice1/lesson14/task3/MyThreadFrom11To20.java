package com.example.practice1.lesson14.task3;

public class MyThreadFrom11To20 implements Runnable {
    @Override
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println(i);
        }
    }
}
