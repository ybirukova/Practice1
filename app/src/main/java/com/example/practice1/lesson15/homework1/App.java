package com.example.practice1.lesson15.homework1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int peopleQueue = scanner.nextInt();
            if (peopleQueue == 0) return;
            ;

            LiftQueue liftQueue = new LiftQueue(peopleQueue);
            SpeedElevator speedElevator = new SpeedElevator(liftQueue);
            BigElevator bigElevator = new BigElevator(liftQueue);
            Thread speedLift = new Thread(speedElevator);
            Thread bigLift = new Thread(bigElevator);

            speedLift.start();
            bigLift.start();
        }

    }
}
