package com.example.practice1.mobile;

public final class MtsSimCard extends SimCard {
    MtsSimCard(int number, int balance) {
        super(330000000 + number, balance);
    }

    @Override
    public String getOperatorName() {
        return super.getOperatorName();
    }

    @Override
    public void makeCall(int numberTo) {
        int payment;
        String strNumberTo = Integer.toString(numberTo);
        if (strNumberTo.startsWith("33")) {
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

    @Override
    public void receiveCall(int numberFrom) {
        int payment;
        String strNumberFrom = Integer.toString(numberFrom);
        if (strNumberFrom.startsWith("33")) {
            super.receiveCall(numberFrom);
        } else {
            payment = 1;
            setBalance(-payment);
            super.receiveCall(numberFrom);
        }
    }
}