package com.example.practice1.lesson15.homework;

import static com.example.practice1.lesson15.homework.App.NULL_AMOUNT;

import java.util.Scanner;

public class LiftHall {
    private int amountOfPassengers;
    private int totalAmountByBigLift;
    private int totalAmountBySpeedLift;
    private final int EXIT_STATUS = 1;

    public synchronized void getByLift(int capacity, String name) {
        if (amountOfPassengers >= capacity) {
            if (capacity == 6) {
                totalAmountBySpeedLift += capacity;
            } else totalAmountByBigLift += capacity;
            amountOfPassengers -= capacity;
            System.out.println(name + " лифт поднял " + capacity + " человек.");
        } else if (amountOfPassengers != NULL_AMOUNT) {
            System.out.println(name + " лифт поднял " + amountOfPassengers + " человек.");
            if (capacity == 6) {
                totalAmountBySpeedLift += amountOfPassengers;
            } else totalAmountByBigLift += amountOfPassengers;
            amountOfPassengers = NULL_AMOUNT;
        }
    }

    public void setAmountOfPassengers() {
        System.out.println("Введите количество людей, пришедших на площадку. При вводе 0 программа завершит выполнение.");
        Scanner scanner = new Scanner(System.in);
        while (true)
            try {
                this.amountOfPassengers = scanner.nextInt();
                if (amountOfPassengers < NULL_AMOUNT) {
                    throw new Exception();
                }
                if (amountOfPassengers == NULL_AMOUNT) {
                    System.out.println("Программа завершена.");
                    System.exit(EXIT_STATUS);
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Введите еще раз.");
                scanner.nextLine();
            }
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void printTotalAmountByBothLifts() {
        System.out.println("Большой лифт поднял всего " + totalAmountByBigLift
                + " человек.");
        System.out.println("Скоростной лифт поднял всего " + totalAmountBySpeedLift
                + " человек.");
    }

    public void setTotalAmountByBigLift(int totalAmountByBigLift) {
        this.totalAmountByBigLift = totalAmountByBigLift;
    }

    public void setTotalAmountBySpeedLift(int totalAmountBySpeedLift) {
        this.totalAmountBySpeedLift = totalAmountBySpeedLift;
    }
}