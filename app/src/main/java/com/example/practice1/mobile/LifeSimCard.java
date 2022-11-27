package com.example.practice1.mobile;

public final class LifeSimCard extends SimCard {
    LifeSimCard(String number, int balance, int pin) {
        super("25" + number, balance, pin);
    }

    @Override
    public String getOperatorName() {
        String operator = null;
        if (getNumber().startsWith("25")) {
            operator = "LIFE";
        }
        return operator;
    }

    @Override
    public void makeCall(String numberTo) {
        int payment;
        payment = (numberTo.startsWith("25")) ? 1 : 3;
        if (getBalance() < payment) {
            System.out.println("Звонок запрещен.");
        } else {
            System.out.println("Звоню на номер " + numberTo);
            setBalance(-payment);
        }
    }

    @Override
    public void receiveCall(String numberFrom) {
        int payment;
        if (numberFrom.startsWith("25")) {
            super.receiveCall(numberFrom);
        } else {
            payment = 1;
            setBalance(-payment);
            super.receiveCall(numberFrom);
        }
    }
}