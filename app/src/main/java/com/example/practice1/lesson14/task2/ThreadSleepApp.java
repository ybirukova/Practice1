package com.example.practice1.lesson14.task2;

public class ThreadSleepApp {
    public static void main(String[] args) throws InterruptedException {
        Runnable myRunnable = () -> {
            for (int i = 1; i < 10; i += 2) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                }
            }
        };
        Thread runnableThread1 = new Thread(myRunnable);
        Thread runnableThread2 = new Thread(myRunnable);
        Thread runnableThread3 = new Thread(myRunnable);

        runnableThread1.start();
        try {
            runnableThread1.join();
        } catch (Exception e){

        }
        runnableThread2.start();
        runnableThread3.start();

    }
}
