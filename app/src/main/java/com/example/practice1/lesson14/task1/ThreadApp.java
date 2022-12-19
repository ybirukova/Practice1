package com.example.practice1.lesson14.task1;

public class ThreadApp {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        Runnable myRunnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        };
        Thread runnableThread = new Thread(myRunnable);

        myThread.start();
        runnableThread.start();
    }
}
