package com.example.practice1.lesson15.homework;

import static com.example.practice1.lesson15.homework.App.NULL_AMOUNT;

public class SpeedLift implements Runnable {
    LiftHall liftHall;

    private final int TIME = 1000;

    public SpeedLift(LiftHall liftHall) {
        this.liftHall = liftHall;
    }

    @Override
    public void run() {
        while (liftHall.getAmountOfPassengers() != NULL_AMOUNT) {
            liftHall.getBySpeedLift();
            try {
                Thread.sleep(TIME);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().interrupt();
    }
}