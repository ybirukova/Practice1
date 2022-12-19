package com.example.practice1.lesson14.task4;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
