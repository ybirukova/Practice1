package com.example.practice1.lesson14.task2;

public class ThreadApp2 {
    public static void main(String[] args) {
        MyThreadEven myThread = new MyThreadEven();

        Runnable myRunnable = () -> {
            for (int i = 1; i < 100; i += 2) {
                System.out.println(i);
            }
        };
        Thread runnableThread = new Thread(myRunnable);

        myThread.start();
        runnableThread.start();
    }
}
