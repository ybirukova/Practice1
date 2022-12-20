package com.example.practice1.lesson14.homework;

import java.util.Random;

public class IncomingCall {
    private int id;
    private String purpose;
    public static final Random RANDOM = new Random();

    private static final int CASE_CONSULT = 1;
    private static final int CASE_ORDER = 2;
    private static final int CASE_RETURN = 3;
    private static final int CASE_PREORDER = 4;
    private static final int CASE_CONDITIONS = 5;
    private static final int CASE_CANCEL_ORDER = 6;
    private static final int CASE_ERROR_CALL = 7;
    private static final int CASE_SERVICE_ORDER = 8;

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
            case CASE_CONSULT:
                purpose = "консультация";
                break;
            case CASE_ORDER:
                purpose = "оформление заказа";
                break;
            case CASE_RETURN:
                purpose = "оформление возврата";
                break;
            case CASE_PREORDER:
                purpose = "предзаказ";
                break;
            case CASE_CONDITIONS:
                purpose = "уточнение условий доставки";
                break;
            case CASE_CANCEL_ORDER:
                purpose = "отмена заказа";
                break;
            case CASE_ERROR_CALL:
                purpose = "ошибочный звонок";
                break;
            case CASE_SERVICE_ORDER:
                purpose = "заказ услуг";
                break;
        }
        return purpose;
    }

    public void printInfoAboutCall(String name) {
        System.out.println("Звонок id = " + getId() + "; Цель звонка: " + getPurpose() + "; Обработан работником: " + name);
    }
}