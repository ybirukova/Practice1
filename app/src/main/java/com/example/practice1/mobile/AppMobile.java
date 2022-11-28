package com.example.practice1.mobile;

import java.util.Random;
import java.util.Scanner;

public class AppMobile {
    public static void main(String[] args) {

        SimCard simDefault = new A1SimCard("1001111", 10, 1111);
        Phone phone = new Phone(simDefault);
        SimCard[] simCards = createArrayOfSim();
        System.out.println("Создан объект телефона. Изначально телефон выключен. В него вставлена симкарта по умолчанию: ");
        System.out.println("Оператор: " + simDefault.getOperatorName() + " Номер: "
                + simDefault.getNumber() + " Баланс: " + simDefault.getBalance() + " Пин: " + simDefault.getPin());
        System.out.println("Введите цифру 0 для отображения списка доступных команд.");
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                switch (inputCommand()) {
                    case 0: {
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 1: {
                        if (!phone.getSim().getIsLocked()) {
                            if (phone.isTurnedOn()) {
                                System.out.println("Телефон уже включен.");
                            } else {
                                phone.turnOn();
                            }
                        }else System.out.println("Симкарта заблокирована!!!");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 2: {
                        printArrayOfSim(simCards);
                        System.out.println("Введите номер симкарты, которую хотите вставить в телефон.");
                        int numberOfSim = in.nextInt();
                        phone.insertNewSim(simCards[numberOfSim]);
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 3: {
                        if (phone.isTurnedOn()) {
                            phone.turnOff();
                        } else
                            System.out.println("Телефон уже выключен.");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 4: {
                        if (!phone.getSim().getIsLocked()) {
                            if (phone.isTurnedOn()) {
                                System.out.println(phone.getSim().getOperatorName() + " "
                                        + phone.getSim().getNumber() + " " + phone.getSim().getBalance());
                            } else {
                                System.out.println("Телефон выключен.");
                            }
                        } else System.out.println("Симкарта заблокирована!!!");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 5: {
                        if (!phone.getSim().getIsLocked()) {
                            if (phone.isTurnedOn()) {
                                printArrayOfSim(simCards);
                            } else {
                                System.out.println("Телефон выключен.");
                            }
                        }else System.out.println("Симкарта заблокирована!!!");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 6: {
                        if (!phone.getSim().getIsLocked()) {
                            if (phone.isTurnedOn()) {
                                System.out.println("Выберите команду:\n" +
                                        "1 - совершить звонок\n" +
                                        "2 - принять звонок\n" +
                                        "3 - назад");
                                int commandCallReceive = in.nextInt();
                                switch (commandCallReceive) {
                                    case 1: {
                                        makeCall(phone);
                                        break;
                                    }
                                    case 2: {
                                        receiveCall(phone);
                                        break;
                                    }
                                    case 3:
                                        break;
                                    default: {
                                        System.out.println("Неверно введена команда.");
                                        System.out.println("Введите команду заново.");
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("Телефон выключен.");
                            }
                        }else System.out.println("Симкарта заблокирована!!!");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 7: {
                        if (!phone.getSim().getIsLocked()) {
                            if (phone.isTurnedOn()) {
                                System.out.println("Введите сумму для пополнения баланса.");
                                int plusBalance = in.nextInt();
                                phone.getSim().setBalance(plusBalance);
                                phone.printBalance();
                            } else
                                System.out.println("Телефон выключен.");
                        }else System.out.println("Симкарта заблокирована!!!");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                    case 8: {
                        System.out.println("Выполнение программы завершено.");
                        System.exit(0);
                        break;
                    }
                    default: {
                        System.out.println("Неверно введена команда. Попробуйте снова.");
                        printCommands(phone.isTurnedOn(), phone.getSim().getIsLocked());
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Неверно введена команда. Попробуйте снова.");
            }
        }
    }

    // Functions:
    static int inputCommand() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    static String rndStr(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        return Integer.toString(i);
    }

    static int rnd(int min, int max) {
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff + 1) + min;
    }

    static SimCard[] createArrayOfSim() {
        Random random = new Random();
        int simArraySize = random.nextInt(10) + 1;
        SimCard[] simCards = new SimCard[simArraySize];

        for (int i = 0; i < simCards.length; i++) {
            int randomNumberForChoosingSim = rnd(1, 3);
            switch (randomNumberForChoosingSim) {
                case 1:
                    simCards[i] = new A1SimCard(rndStr(1000000, 9999999), rnd(-3, 3), rnd(1000, 9999));
                    break;
                case 2:
                    simCards[i] = new MtsSimCard(rndStr(1000000, 9999999), rnd(-3, 3), rnd(1000, 9999));
                    break;
                case 3:
                    simCards[i] = new LifeSimCard(rndStr(1000000, 9999999), rnd(-3, 3), rnd(1000, 9999));
                    break;
            }
        }
        return simCards;
    }

    static void printArrayOfSim(SimCard[] simCards) {
        System.out.println("Список доступных симкарт:");
        int i = 0;
        for (SimCard simCard : simCards) {
            System.out.println(i + ". Оператор: " + simCard.getOperatorName() + " Номер: "
                    + simCard.getNumber() + " Баланс: " + simCard.getBalance() + " Пин: " + simCard.getPin());
            i++;
        }
    }

    static void makeCall(Phone phone) {
        System.out.println("Введите номер телефона, на который хотите позвонить (29/33/25 + 7 любых цифр)");
        Scanner in = new Scanner(System.in);
        String numberToCall = in.nextLine();

        if (!(numberToCall.length() == 9)) {
            System.out.println("Неправильный номер. Номер должен иметь 9 цифр.");
        } else if (numberToCall.startsWith("29")
                || numberToCall.startsWith("33")
                || numberToCall.startsWith("25")) {
            phone.makeCall(numberToCall);
        } else {
            System.out.println("Неправильный номер. Номер должен начинаться с 29/33/25.");
        }
    }

    static void receiveCall(Phone phone) {
        System.out.println("Введите номер телефона, с которого вам звонят (29/33/25 + 7 любых цифр)");
        Scanner in = new Scanner(System.in);
        String numberToCall = in.nextLine();

        if (!(numberToCall.length() == 9)) {
            System.out.println("Неправильный номер. Номер должен иметь 9 цифр.");
        } else if (numberToCall.startsWith("29")
                || numberToCall.startsWith("33")
                || numberToCall.startsWith("25")) {
            phone.receiveCall(numberToCall);
        } else {
            System.out.println("Неправильный номер. Номер должен начинаться с 29/33/25.");
        }
    }

    static void printCommands(boolean isPhoneTurnedOn, boolean isSimLocked) {
        if (!isSimLocked) {
            if (isPhoneTurnedOn) {
                System.out.println("Доступны следующие команды:\n" +
                        "0 - показать список доступных команд\n" +
                        "2 - вставить симку\n" +
                        "3 - выключить телефон\n" +
                        "4 - вывести инфу о симке\n" +
                        "5 - вывести инфу о доступных симках\n" +
                        "6 - совершить/принять звонок\n" +
                        "7 - положить деньги на баланс\n" +
                        "8 - завершить выполнение программы");
            } else {
                System.out.println("Доступны следующие команды:\n" +
                        "0 - показать список доступных команд\n" +
                        "1 - включить телефон\n" +
                        "2 - вставить симку");
            }
        } else {
            System.out.println("Доступны следующие команды:\n" +
                    "0 - показать список доступных команд\n" +
                    "2 - вставить симку\n" +
                    "8 - завершить выполнение программы");
        }
    }
}