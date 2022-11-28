package com.example.practice1.mobile;

public class Phone {
    private SimCard sim;
    private boolean isTurnedOn = false;

    public Phone(SimCard sim) {
        this.sim = sim;
    }

    public void insertNewSim(SimCard sim1) {
        this.sim = sim1;
        System.out.println("Замена симкарты. Номер: " + sim.getNumber() +
                " Оператор: " + sim.getOperatorName() + " Баланс: " + sim.getBalance() + " Пин: " + sim.getPin());
        sim.checkPin();
    }

    public SimCard getSim() {
        return sim;
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

    void turnOn() {
        System.out.println("Включение телефона...");
        sim.checkPin();
        isTurnedOn = true;
    }

    void turnOff() {
        System.out.println("Выключение телефона...");
        isTurnedOn = false;
        System.out.println("Телефон выключен.");
    }

    boolean isTurnedOn() {
        return isTurnedOn;
    }
}