package com.example.practice1.lesson11.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MessengerUtil {
    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String COMMANDS = "0 - вывести все команды\n" +
            "1 - создать пользователя\n" +
            "2 - написать сообщение пользователю\n" +
            "3 - прочитать сообщение пользователя\n" +
            "4 - вывести список всех пользователей\n" +
            "5 - закончить выполнение программы";

    private static final String EMPTY_LIST = "Список пользователей пуст. Сначала создайте пользователя.";

    static String chooseCommand() {
        System.out.println("Введите номер команды.");
        System.out.println(COMMANDS);
        return SCANNER.nextLine();
    }

    public static void doCommand(String command) {
        switch (command) {
            case "0":
                System.out.println(COMMANDS);
                break;
            case "1":
                createUser();
                break;
            case "2":
                if (isListOfUserEmpty()) {
                    System.out.println(EMPTY_LIST);
                } else writeTextOfMessage(chooseUserToWrite());
                break;
            case "3":
                if (isListOfUserEmpty()) {
                    System.out.println(EMPTY_LIST);
                } else readAndDeleteMessageOfUser();
                break;
            case "4":
                if (isListOfUserEmpty()) {
                    System.out.println(EMPTY_LIST);
                } else printListOfUser();
                break;
            case "5":
                exitProgram();
                break;
            default:
                System.out.println("Неверно введена команда");
        }
    }

    private static boolean isListOfUserEmpty() {
        boolean isListOfUserEmpty;
        isListOfUserEmpty = users.size() == 0;
        return isListOfUserEmpty;
    }

    private static void createUser() {
        System.out.println("Для создания пользователя введите имя.");
        String name = SCANNER.nextLine();
        User user = new User(name);
        users.add(user);
        System.out.println("Пользователь " + name + " добавлен в список.");
    }

    private static void printListOfUser() {
        int i = 1;
        for (User user : users
        ) {
            System.out.println(i + ". " + user.getUserName());
            i++;
        }
    }

    private static User chooseUserToWrite() {
        System.out.println("Список существующих пользователей:");
        printListOfUser();
        System.out.println("Введите индекс пользователя, которому хотите написать");
        int numberOfUser = writeAndCheckNumberOfUser();
        return users.get(numberOfUser);
    }

    private static void writeTextOfMessage(User user) {
        do {
            System.out.println("Напишите сообщение, которое хотите отправить пользователю " + user.getUserName());
            String textOfMessage = SCANNER.nextLine();
            user.writeToUser(textOfMessage);
            System.out.println("Сообщение отправлено.");
        }
        while (isRepeat("Хотите отправить еще одно сообщение этому пользователю? (0 - нет, выйти в меню, 1 - да)"));
    }

    private static void readAndDeleteMessageOfUser() {
        System.out.println("Список существующих пользователей:");
        printListOfUser();
        System.out.println("Введите номер пользователя, чьё сообщение хотите прочитать и удалить.");
        int numberOfUser = writeAndCheckNumberOfUser();
        User user = users.get(numberOfUser);
        if (user.getMessages().size() != 0) {
            do {
                user.readAndDeleteMessage();
            } while (isRepeat("Хотите прочитать и удалить следующее сообщение? (0 - нет, выйти в меню, 1 - да)"));
        } else System.out.println("У пользователя нет новых сообщений");
    }

    private static int writeAndCheckNumberOfUser() {
        int numberOfUser;
        while (true) {
            try {
                numberOfUser = SCANNER.nextInt();
            } catch (InputMismatchException i) {
                System.out.println("Неверно введен индекс пользователя.");
                SCANNER.nextLine();
                continue;
            }
            if (numberOfUser <= 0 || numberOfUser > users.size()) {
                System.out.println("Пользователь с таким индексом отсутствует.");
            } else break;
        }
        SCANNER.nextLine();
        return numberOfUser - 1;
    }

    private static boolean isRepeat(String text) {
        boolean repeat;
        System.out.println(text);
        String whatToDo;
        while (true) {
            whatToDo = SCANNER.next();
            if (whatToDo.equals("0")) {
                repeat = false;
                break;
            } else if (whatToDo.equals("1")) {
                repeat = true;
                break;
            } else System.out.println("Неверно введена команда. Попробуйте еще раз.");
        }
        SCANNER.nextLine();
        return repeat;
    }

    private static void exitProgram() {
        System.exit(0);
    }
}