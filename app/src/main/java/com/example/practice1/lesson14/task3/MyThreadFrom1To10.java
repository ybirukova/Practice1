package com.example.practice1.lesson14.task3;

public class MyThreadFrom1To10 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
