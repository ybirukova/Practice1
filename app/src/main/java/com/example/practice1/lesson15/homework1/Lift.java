package com.example.practice1.lesson15.homework1;

public abstract class Lift implements Runnable {
    String name;
    int capacity;
    long time;
    int totalAmount;
    LiftQueue queue;

    public Lift(String name, int capacity, long time, LiftQueue queue) {
        this.name = name;
        this.capacity = capacity;
        this.time = time;
        this.queue = queue;
    }

    public void transportPeople() {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int transportedPeople = queue.getPeople(capacity);
        if (transportedPeople == 0) return;
        System.out.println(name + " поднял" + transportedPeople + " человек.");
        totalAmount += transportedPeople;
    }

    @Override
    public void run() {
        while (queue.count != 0){
            transportPeople();
        }
        System.out.println(name + " поднял всего " + totalAmount);
    }
}
