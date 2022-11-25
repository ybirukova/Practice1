package com.example.practice1.mobile;

import java.util.Random;
import java.util.Scanner;

public class AppMobile {
    public static void main(String[] args) {
        Random random = new Random();
        int simArraySize = random.nextInt(10) + 1;
        SimCard[] simCards = new SimCard[simArraySize];

        System.out.println("Список симкарт:");
        for (int i = 0; i < simCards.length; i++) {

            int randomNumberForChoosingSim = rnd(1, 3);
            switch (randomNumberForChoosingSim) {
                case 1:
                    simCards[i] = new A1SimCard(rnd(1000000, 9999999), rnd(-3, 3));
                    break;
                case 2:
                    simCards[i] = new MtsSimCard(rnd(1000000, 9999999), rnd(-3, 3));
                    break;
                case 3:
                    simCards[i] = new LifeSimCard(rnd(1000000, 9999999), rnd(-3, 3));
                    break;
            }
            System.out.println(simCards[i].getOperatorName() + " " + simCards[i].getNumber() + " " + simCards[i].getBalance());
        }

        Phone phone = new Phone(new SimCard("290000000", 0));
        System.out.println("");
        for (int i = 0; i < simCards.length; i += 2) {
            phone.insertNewSim(simCards[i]);
            System.out.println("Введите номер телефона, на который хотите позвонить (29/33/25 + 7 любых цифр)");
            Scanner in = new Scanner(System.in);
            String numberToCall = in.nextLine();

            if (!(numberToCall.length() == 9)) {
                System.out.println("Неправильный номер. Номер должен иметь 9 цифр.");
                i -= 2;
            } else if (numberToCall.startsWith("29")
                    || numberToCall.startsWith("33")
                    || numberToCall.startsWith("25")) {
                phone.makeCall(numberToCall);
                phone.printBalance();
            } else {
                System.out.println("Неправильный номер. Номер должен начинаться с 29/33/25.");
                i -= 2;
            }
        }

        System.out.println("");
        for (int i = 1; i < simCards.length; i += 2) {
            phone.insertNewSim(simCards[i]);
            System.out.println("Введите номер телефона, с которого вам звонят (29/33/25 + 7 любых цифр)");
            Scanner in = new Scanner(System.in);
            String numberToCall = in.nextLine();

            if (!(numberToCall.length() == 9)) {
                System.out.println("Неправильный номер. Номер должен иметь 9 цифр.");
                i -= 2;
            } else if (numberToCall.startsWith("29")
                    || numberToCall.startsWith("33")
                    || numberToCall.startsWith("25")) {
                phone.receiveCall(numberToCall);
                phone.printBalance();
            } else {
                System.out.println("Неправильный номер. Номер должен начинаться с 29/33/25.");
                i -= 2;
            }
        }
    }

    static int rnd(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return i;
    }
}