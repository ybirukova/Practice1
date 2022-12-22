package com.example.practice1.lesson15;

import java.util.Scanner;

public class PeopleQueue {
    private int sizeOfQueue;
    private int amountOfSeats;
    private boolean isNeedStopQueueFulling;
    private final int NULL_AMOUNT = 0;
    private final int EXIT_STATUS = 1;
    private final int EXIT_AMOUNT = 20;
    private final int ONE_MAN = 1;

    public synchronized void get() {
        while (amountOfSeats == NULL_AMOUNT) {
            System.out.println("В маршрутке нету свободных мест. Ожидайте следующую.");
            System.out.println("-------------------------");
            System.out.println("Новая маршрутка приехала.");
            isNeedStopQueueFulling = true;
            setAmountOfSeatsConsole();
            if (amountOfSeats > EXIT_AMOUNT) {
                System.out.println("Маршруток сегодня больше не будет.");
                System.exit(EXIT_STATUS);
            }
        }
        isNeedStopQueueFulling = false;
        while (sizeOfQueue < ONE_MAN) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sizeOfQueue--;
        System.out.println("1 человек занял место в маршрутке. Человек в очереди: " + sizeOfQueue);
        setAmountOfSeats(amountOfSeats - ONE_MAN);
        System.out.println("Мест в маршрутке осталось: " + amountOfSeats);
        notify();
    }

    public synchronized void put() {
        while (isNeedStopQueueFulling) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        sizeOfQueue++;
        System.out.println("1 человек пришёл. Человек в очереди: " + sizeOfQueue);
        notify();
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public void setAmountOfSeatsConsole() {
        System.out.println("Введите число свободных мест в маршрутке. При вводе значения больше "
                + EXIT_AMOUNT + ", программа завершит выполнение.");
        Scanner scanner = new Scanner(System.in);
        while (true)
            try {
                this.amountOfSeats = scanner.nextInt();
                if (amountOfSeats < 0) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Некорректный ввод. Введите еще раз.");
                scanner.nextLine();
            }
    }
}