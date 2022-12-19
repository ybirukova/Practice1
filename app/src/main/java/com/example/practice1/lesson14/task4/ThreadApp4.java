package com.example.practice1.lesson14.task4;

public class ThreadApp4 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);

        thread.start();
        thread1.start();
        thread2.start();
    }
}
