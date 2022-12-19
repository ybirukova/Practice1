package com.example.practice1.lesson14.task3;

public class ThreadApp3 {
    public static void main(String[] args) {
        MyThreadFrom1To10 myThreadFrom1To10 = new MyThreadFrom1To10();
        MyThreadFrom11To20 myThreadFrom11To20 = new MyThreadFrom11To20();
        Thread threadMyThreadFrom11To20 = new Thread(myThreadFrom11To20);

        Runnable myRunnable = () -> {
            for (int i = 21; i <= 30; i++) {
                System.out.println(i);
            }
        };
        Thread runnableThread = new Thread(myRunnable);

        System.out.println(Thread.currentThread().getName());
        myThreadFrom1To10.start();
        System.out.println(myThreadFrom1To10.getName());
        try {
            myThreadFrom1To10.join();
        } catch (Exception e) {
        }
        threadMyThreadFrom11To20.start();
        System.out.println(threadMyThreadFrom11To20.getName());
        try {
            threadMyThreadFrom11To20.join();
        } catch (Exception e) {
        }
        runnableThread.start();
        System.out.println(runnableThread.getName());
    }
}