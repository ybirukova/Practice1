package com.example.practice1.mobile;

public class SimCard {
    private String number;
    private int balance;

    protected SimCard(String number, int balance) {
        this.number = number;
        this.balance = balance;
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
}