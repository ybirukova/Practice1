package com.example.practice1.lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        String firstNumber = scanner.nextLine();
        String secondNumber = scanner.nextLine();
    }

    static void workWithString (String firstNumber, String secondNumber){
        StringBuilder str = new StringBuilder(firstNumber);
        StringBuilder firstStr = str.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber+secondNumber);
        StringBuilder secondStr = str.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber+secondNumber);
        System.out.println(str.insert(firstNumber.length()+3+secondNumber.length()-1, "равно"));
        System.out.println(str.deleteCharAt(firstNumber.length()+3+secondNumber.length()+5));

        System.out.println(str.replace(0, str.length(), "+"));
    }
}
