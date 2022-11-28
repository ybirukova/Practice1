package com.example.practice1.mobile;

public final class MtsSimCard extends SimCard {
    MtsSimCard(String number, int balance, int pin) {
        super("33" + number, balance, pin);
    }

    @Override
    public String getOperatorName() {
        String operator = null;
        if (getNumber().startsWith("33")) {
            operator = "MTS";
        }
        return operator;
    }

    @Override
    public void makeCall(String numberTo) {
        int payment;
        payment = (numberTo.startsWith("33")) ? 1 : 3;
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
        if (numberFrom.startsWith("33")) {
            super.receiveCall(numberFrom);
        } else {
            payment = 1;
            setBalance(-payment);
            super.receiveCall(numberFrom);
        }
    }
}