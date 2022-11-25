package com.example.practice1.mobile;

public class SimCard {
    private int number;
    private int balance;

    protected SimCard(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }

    int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance += balance;
    }

    public int getNumber() {
        return number;
    }

    public String getOperatorName() {
        String operatorName = null;
        String number = Integer.toString(getNumber());

        if (number.startsWith("29")) {
            operatorName = "A1";
        } else if (number.startsWith("33")) {
            operatorName = "MTS";
        } else if (number.startsWith("25")) {
            operatorName = "LIFE";
        }
        return operatorName;
    }

    public void makeCall(int numberTo) {
        int payment;
        String strNumberTo = Integer.toString(numberTo);
        if (strNumberTo.startsWith("  ")) {
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

    public void receiveCall(int numberFrom) {
        System.out.println("Принимаю звонок с номера " + numberFrom);
    }
}