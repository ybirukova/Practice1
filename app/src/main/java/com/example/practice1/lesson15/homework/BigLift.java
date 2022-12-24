package com.example.practice1.lesson15.homework;

import static com.example.practice1.lesson15.homework.App.NULL_AMOUNT;

public class BigLift implements Runnable {
    LiftHall liftHall;

    private final int TIME = 2000;

    public BigLift(LiftHall liftHall) {
        this.liftHall = liftHall;
    }

    @Override
    public void run() {
        while (liftHall.getAmountOfPassengers() != NULL_AMOUNT) {
            liftHall.getByBigLift();
            try {
                Thread.sleep(TIME);
            } catch (Exception e) {
                e.printStackTrace();
            }
            liftHall.setIsBigLiftEmpty(true);
        }
        Thread.currentThread().interrupt();
    }
}