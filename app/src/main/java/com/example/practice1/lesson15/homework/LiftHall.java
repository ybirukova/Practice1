package com.example.practice1.lesson15.homework;

import static com.example.practice1.lesson15.homework.App.NULL_AMOUNT;

import java.util.Scanner;

public class LiftHall {
    private int amountOfPassengers;
    private boolean isBigLiftIsEmpty;
    private int totalAmountByBigLift;
    private int totalAmountBySpeedLift;
    private final int CAPACITY_OF_BIG_LIFT = 10;
    private final int CAPACITY_OF_SPEED_LIFT = 6;
    private final int EXIT_STATUS = 1;

    public synchronized void getByBigLift() {
        isBigLiftIsEmpty = true;
        if (amountOfPassengers >= CAPACITY_OF_BIG_LIFT) {
            System.out.println("Большой лифт поднял " + CAPACITY_OF_BIG_LIFT + " человек.");
            totalAmountByBigLift += CAPACITY_OF_BIG_LIFT;
            amountOfPassengers -= CAPACITY_OF_BIG_LIFT;
            isBigLiftIsEmpty = false;
        } else if (amountOfPassengers != NULL_AMOUNT) {
            System.out.println("Большой лифт поднял " + amountOfPassengers + " человек.");
            totalAmountByBigLift += amountOfPassengers;
            amountOfPassengers = NULL_AMOUNT;
        }
        notify();
    }

    public synchronized void getBySpeedLift() {
        while (isBigLiftIsEmpty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (amountOfPassengers >= CAPACITY_OF_SPEED_LIFT) {
            totalAmountBySpeedLift += CAPACITY_OF_SPEED_LIFT;
            amountOfPassengers -= CAPACITY_OF_SPEED_LIFT;
            System.out.println("Скоростной лифт поднял " + CAPACITY_OF_SPEED_LIFT + " человек.");
        } else if (amountOfPassengers != NULL_AMOUNT) {
            System.out.println("Скоростной лифт поднял " + amountOfPassengers + " человек.");
            totalAmountBySpeedLift += amountOfPassengers;
            amountOfPassengers = NULL_AMOUNT;
        }
        notify();
    }

    public void setAmountOfPassengers() {
        System.out.println("Введите количество людей, пришедщих на площадку. При вводе 0 программа завершит выполнение.");
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

    public void setIsBigLiftEmpty(boolean isBigLiftEmpty) {
        this.isBigLiftIsEmpty = isBigLiftEmpty;
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