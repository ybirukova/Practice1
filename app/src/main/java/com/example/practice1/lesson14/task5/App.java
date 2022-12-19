package com.example.practice1.lesson14.task5;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable myRunnable = () -> {

            while (counter.getValue() != 30) {
                synchronized (counter) {
                    if (counter.getValue() != 30) {
                        counter.count();
                        System.out.print(counter.getValue() + " ");
                        System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep(100);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        };
        Thread runnableThread = new Thread(myRunnable);
        Thread runnableThread1 = new Thread(myRunnable);
        Thread runnableThread2 = new Thread(myRunnable);

        runnableThread.start();
        runnableThread1.start();
        runnableThread2.start();
    }
}