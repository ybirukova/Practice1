package com.example.practice1.lesson9.task_login_password;

import java.util.Scanner;

public class TryThrow {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login (it must contain only latin letters, numbers, underscore)");
        String login = scanner.nextLine();
        System.out.println("Enter your password (it must contain only latin letters, numbers, underscore)");
        String password = scanner.nextLine();
        System.out.println("Confirm your password (it must match with your password)");
        String confirmPassword = scanner.nextLine();

        method(login, password, confirmPassword);

        if (method(login, password, confirmPassword))
            System.out.println("Login and password are successfully created.");
        else System.out.println("An error was found.");
    }

    static boolean method(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        boolean loginCorrect = false;
        boolean passwordCorrect = false;
        boolean confirmPasswordCorrect = false;
        String regex = "[A-Za-z\\d_]{1,20}";
        try {
            if (!login.matches(regex)) {
                throw new WrongLoginException("Forbidden characters are used in login or the length of password is too large.");
            } else {
                loginCorrect = true;
                System.out.println("Login is accepted");
            }

            if (!password.matches(regex)) {
                throw new WrongPasswordException("Forbidden characters are used in password or the length of password is too large.");
            } else {
                passwordCorrect = true;
                System.out.println("Password is accepted");
            }

            if (!(confirmPassword.equals(password))) {
                throw new WrongPasswordException("Password isn't confirmed");
            } else {
                confirmPasswordCorrect = true;
                System.out.println("Password is confirmed");
            }
        } catch (WrongLoginException | WrongPasswordException wle) {
            System.out.println("\u001B[35m" + wle + "\u001B[0m");
        }
        return (loginCorrect && passwordCorrect && confirmPasswordCorrect);
    }
}