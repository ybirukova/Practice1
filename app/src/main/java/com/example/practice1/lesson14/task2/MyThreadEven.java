package com.example.practice1.lesson14.task2;

public class MyThreadEven extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i += 2) {
            System.out.println(i);
        }
    }
}
