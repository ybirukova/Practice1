package com.example.practice1.mobile;

import java.util.Scanner;

public class SimCard {
    private String number;
    private int balance;
    private int pin;
    private boolean isLocked;

    protected SimCard(String number, int balance, int pin) {
        this.number = number;
        this.balance = balance;
        this.pin = pin;
    }

    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public String getNumber() {
        return number;
    }

    public String getOperatorName() {
        String operatorName = null;
        if (!getOperatorName().startsWith("29")
                || !getOperatorName().startsWith("33")
                || !getOperatorName().startsWith("33")) {
            operatorName = "Нет оператора";
        }
        return operatorName;
    }

    public void makeCall(String numberTo) {
        int payment;

        if (numberTo.startsWith("  ")) {
            payment = 1;
        } else {
            payment = 3;
        }
        if (getBalance() < payment) {
            System.out.println("Звонок запрещен.");
        } else {
            System.out.println("Звоню на номер " + numberTo);
            setBalance(-payment);
        }
    }

    public void receiveCall(String numberFrom) {
        System.out.println("Принимаю звонок с номера " + numberFrom);
    }

    public void checkPin() {
            if (!isLocked){
            for (int tries = 1; tries <= 3; tries++) {
                System.out.println("Введите пин-код. Осталось попыток: " + (4 - tries));
                Scanner in = new Scanner(System.in);
                int pin1 = in.nextInt();
                if (!(pin1 == pin)) {
                    System.out.println("Неверный пин-код.");
                    if (tries == 3) {
                        isLocked = true;
                        System.out.println("Попыток ввести пин-код больше нет. Симкарта заблокирована.");
                    }
                } else {
                    isLocked = false;
                    System.out.println("Пин-код верный.");
                    break;
                }
            }
        } else {
            System.out.println("Симкарта заблокирована!!!");
        }
    }

    boolean getIsLocked() {
        return isLocked;
    }

    public int getPin() {
        return pin;
    }
}