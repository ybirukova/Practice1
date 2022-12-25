package com.example.practice1.lesson15.homework;

import static com.example.practice1.lesson15.homework.App.NULL_AMOUNT;

abstract public class Lift implements Runnable {
    LiftHall liftHall;

    public Lift(LiftHall liftHall) {
        this.liftHall = liftHall;
    }

    @Override
    public void run() {
        while (liftHall.getAmountOfPassengers() != NULL_AMOUNT) {
            liftHall.getByLift(getCapacity(), getNameLift());
            try {
                Thread.sleep(getTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().interrupt();
    }

    public abstract int getTime();

    public abstract String getNameLift();

    public abstract int getCapacity();
}