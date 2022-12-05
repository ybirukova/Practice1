package com.example.practice1.lesson9.task_login_password;

import java.util.Scanner;

public class TryThrow {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        signIn();
    }

    private static final String INPUT_PATTERN = "[A-Za-z\\d_]{1,20}";

    static void signIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login (it must contain only latin letters, numbers, underscore)");
        String login = scanner.nextLine();
        System.out.println("Enter your password (it must contain only latin letters, numbers, underscore)");
        String password = scanner.nextLine();
        System.out.println("Confirm your password (it must match with your password)");
        String confirmPassword = scanner.nextLine();
        try {
            if (checkLoginAndPassword(login, password, confirmPassword)) {
                System.out.println("You signed in successfully.");
            } else System.out.println("You didn't sign in.");
        } catch (WrongLoginException | WrongPasswordException wle) {
            System.out.println("\u001B[35m" + wle + "\u001B[0m");
        }
    }

    static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(INPUT_PATTERN)) {
            throw new WrongLoginException("Forbidden characters are used in login or the length of login is too large.");
        } else if (!password.matches(INPUT_PATTERN)) {
            throw new WrongPasswordException("Forbidden characters are used in password or the length of password is too large.");
        } else if (!(confirmPassword.equals(password))) {
            throw new WrongPasswordException("Password isn't confirmed");
        } else {
            System.out.println("Login and password is accepted. Password is confirmed");
        }

        return true;
    }
}