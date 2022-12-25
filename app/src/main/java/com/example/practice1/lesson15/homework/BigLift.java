package com.example.practice1.lesson15.homework;

public class BigLift extends Lift {
    private final int TIME = 2000;
    private final String NAME = "Большой";
    private final int CAPACITY = 10;

    public BigLift(LiftHall liftHall) {
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