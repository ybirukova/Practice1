package com.example.practice1.lesson15.homework;

public class SpeedLift extends Lift {
    private final int TIME = 1000;
    private final String NAME = "Скоростной";
    private final int CAPACITY = 6;

    public SpeedLift(LiftHall liftHall) {
        super(liftHall);
    }

    @Override
    public int getTime() {
        return TIME;
    }

    @Override
    public String getNameLift() {
        return NAME;
    }

    @Override
    public int getCapacity() {
        return CAPACITY;
    }
}