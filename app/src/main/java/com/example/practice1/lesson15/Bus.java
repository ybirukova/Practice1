package com.example.practice1.lesson15;

public class Bus implements Runnable {
    PeopleQueue peopleQueue;

    Bus(PeopleQueue peopleQueue) {
        this.peopleQueue = peopleQueue;
    }

    public void run() {
        while (true) {
            peopleQueue.get();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}