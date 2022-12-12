package com.example.practice1.lesson11.homework;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Messenger {
    public static void main(String[] args) {
        while (true) {
            doCommand(chooseCommand());
        }
    }

    private static final ArrayList<User> users = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String COMMANDS = "0 - вывести все команды\n" +
            "1 - создать пользователя\n" +
            "2 - написать сообщение пользователю\n" +
            "3 - прочитать сообщение пользователя\n" +
            "4 - вывести список всех пользователей\n" +
            "5 - закончить выполнение программы";

    private static final String EMPTY_LIST_ERROR = "Список пользователей пуст. Сначала создайте пользователя.";
    private static final String PRINT_ALL_COMMANDS = "0";
    private static final String CREATE_USER = "1";
    private static final String WRITE_MESSAGE = "2";
    private static final String READ_MESSAGE = "3";
    private static final String PRINT_USER_LIST = "4";
    private static final String EXIT_PROGRAM = "5";
    private static final int SUCCESSFUL_TERMINATION = 0;

    private static String chooseCommand() {
        System.out.println("Введите номер команды.");
        System.out.println(COMMANDS);
        return SCANNER.nextLine();
    }

    public static void doCommand(String command) {
        switch (command) {
            case PRINT_ALL_COMMANDS:
                System.out.println(COMMANDS);
                break;
            case CREATE_USER:
                createUser();
                break;
            case WRITE_MESSAGE:
                if (users.isEmpty()) {
                    System.out.println(EMPTY_LIST_ERROR);
                } else writeTextOfMessage(chooseUserToWrite());
                break;
            case READ_MESSAGE:
                if (users.isEmpty()) {
                    System.out.println(EMPTY_LIST_ERROR);
                } else readAndDeleteMessageOfUser();
                break;
            case PRINT_USER_LIST:
                if (users.isEmpty()) {
                    System.out.println(EMPTY_LIST_ERROR);
                } else printListOfUser();
                break;
            case EXIT_PROGRAM:
                exitProgram();
                break;
            default:
                System.out.println("Неверно введена команда");
        }
    }

    private static void createUser() {
        System.out.println("Для создания пользователя введите имя.");
        String name = SCANNER.nextLine();
        User user = new User(name);
        users.add(user);
        System.out.println("Пользователь " + name + " добавлен в список.");
    }

    private static void printListOfUser() {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + 1 + ". " + users.get(i).getUserName());
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
        if (!user.getMessages().isEmpty()) {
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
        System.out.println(text);
        String whatToDo;
        while (true) {
            whatToDo = SCANNER.next();
            SCANNER.nextLine();
            if (whatToDo.equals(PRINT_ALL_COMMANDS)) {
                return false;
            } else if (whatToDo.equals(CREATE_USER)) {
                return true;
            } else System.out.println("Неверно введена команда. Попробуйте еще раз.");
        }
    }

    private static void exitProgram() {
        System.exit(SUCCESSFUL_TERMINATION);
    }
}