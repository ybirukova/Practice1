package com.example.practice1.lesson14.homework;

import java.util.ArrayList;
import java.util.List;

public class CallCenter {
    private static int count;
    private static final String NAME_WORKER1 = "Работник1";
    private static final String NAME_WORKER2 = "Работник2";
    private static final String NAME_WORKER3 = "Работник3";
    private static final int TIME_TO_SLEEP = 1000;
    private static final int AMOUNT_OF_CALLS = 8;

    public static void main(String[] args) {
        List<IncomingCall> listOfCalls = new ArrayList<>();
        for (int i = 0; i < AMOUNT_OF_CALLS; i++) {
            listOfCalls.add(new IncomingCall());
        }

        Runnable myRunnable = () -> {
            for (int i = 0; i < AMOUNT_OF_CALLS; i++) {
                listOfCalls.add(new IncomingCall());
                synchronized (listOfCalls) {
                    if (i == count) {
                        System.out.print((i + 1) + ". ");
                        listOfCalls.get(i).printInfoAboutCall(Thread.currentThread().getName());
                        count += 1;
                        try {
                            Thread.sleep(TIME_TO_SLEEP);
                        } catch (Exception e) {
                            System.out.println("ошибка");
                        }
                    }
                }
            }
        };

        Thread workerThread1 = new Thread(myRunnable);
        Thread workerThread2 = new Thread(myRunnable);
        Thread workerThread3 = new Thread(myRunnable);

        workerThread1.setName(NAME_WORKER1);
        workerThread2.setName(NAME_WORKER2);
        workerThread3.setName(NAME_WORKER3);

        workerThread1.start();
        workerThread2.start();
        workerThread3.start();
    }
}