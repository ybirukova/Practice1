package com.example.practice1.lesson14.homework;

import java.util.Random;

public class IncomingCall {
    private int id;
    private String purpose;
    public static final Random RANDOM = new Random();

    public IncomingCall() {
        this.id = setRandomId();
        this.purpose = setRandomPurpose();
    }

    public int getId() {
        return id;
    }

    public String getPurpose() {
        return purpose;
    }

    private int setRandomId() {
        return id = RANDOM.nextInt(9001) + 999;
    }

    private String setRandomPurpose() {
        int randomNumber = RANDOM.nextInt(8) + 1;
        switch (randomNumber) {
            case 1:
                purpose = "консультация";
                break;
            case 2:
                purpose = "оформление заказа";
                break;
            case 3:
                purpose = "оформление возврата";
                break;
            case 4:
                purpose = "предзаказ";
                break;
            case 5:
                purpose = "уточнение условий доставки";
                break;
            case 6:
                purpose = "отмена заказа";
                break;
            case 7:
                purpose = "ошибочный звонок";
                break;
            case 8:
                purpose = "заказ услуг";
                break;
        }
        return purpose;
    }

    public void printInfoAboutCall(String name) {
        System.out.println("Звонок id = " + getId() + "; Цель звонка: " + getPurpose() + "; Обработан работником: " + name);
    }
}