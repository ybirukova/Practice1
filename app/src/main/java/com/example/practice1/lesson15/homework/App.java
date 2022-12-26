package com.example.practice1.lesson15.homework;

public class App {
    public static final int NULL_AMOUNT = 0;

    public static void main(String[] args) {
        LiftHall liftHall = new LiftHall();
        BigLift bigLift = new BigLift(liftHall);
        SpeedLift speedLift = new SpeedLift(liftHall);

        while (true) {
            liftHall.setTotalAmountByBigLift(NULL_AMOUNT);
            liftHall.setTotalAmountBySpeedLift(NULL_AMOUNT);
            liftHall.setAmountOfPassengers();
            Thread threadBigLift = new Thread(bigLift, "BigLift");
            Thread threadSpeedLift = new Thread(speedLift, "SpeedLift");
            threadBigLift.start();
            threadSpeedLift.start();

            while (!threadBigLift.isInterrupted() && !threadSpeedLift.isInterrupted()) {
                Thread.currentThread().interrupt();
            }
            System.out.println();
            liftHall.printTotalAmountByBothLifts();
        }
    }
}