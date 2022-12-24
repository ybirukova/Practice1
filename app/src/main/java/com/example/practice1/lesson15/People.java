package com.example.practice1.lesson15;

public class People implements Runnable {
    Bus bus;
    PeopleQueue peopleQueue;

    People(PeopleQueue peopleQueue, Bus bus) {
        this.peopleQueue = peopleQueue;
        this.bus = bus;
    }

    public void run() {
        while (true) {
            peopleQueue.put();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}