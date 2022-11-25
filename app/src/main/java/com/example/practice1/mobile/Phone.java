package com.example.practice1.mobile;

public class Phone {
    private SimCard sim;

    public Phone(SimCard sim) {
        this.sim = sim;
    }

    void insertNewSim(SimCard sim1) {
        sim = sim1;
        System.out.println("Замена симкарты. Номер: " + sim.getNumber() +
                ", Оператор: " + sim.getOperatorName() + ", Баланс: " + sim.getBalance());
    }

    void makeCall(String numberTo) {
        sim.makeCall(numberTo);
    }

    void receiveCall(String numberFrom) {
        sim.receiveCall(numberFrom);
    }

    void printBalance() {
        System.out.println("Текущий баланс: " + sim.getBalance());
    }
}