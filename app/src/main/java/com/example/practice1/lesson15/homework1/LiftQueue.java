package com.example.practice1.lesson15.homework1;

public class LiftQueue {
    int count;

    public LiftQueue(int count) {
        this.count = count;
    }

    public synchronized int getPeople(int peopleCount) {
        int result;
        if (peopleCount <= count) {
            count -= peopleCount;
            result = peopleCount;
        } else {
            result = count;
            count = 0;
        }
        return result;
    }
}
