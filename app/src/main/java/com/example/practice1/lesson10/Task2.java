package com.example.practice1.lesson10;

public class Task2 {
    public static void main(String[] args) {
        printStringInfo("I like Java!!!");
    }

    static void printStringInfo(String str) {
        System.out.println("Последний символ в строке: " + str.charAt(str.length() - 1));
        System.out.println("Строка заканчивается символами \"!!!\": " + str.endsWith("!!!"));
        System.out.println("Строка начинается с \"I like\": " + str.startsWith("I like"));
        System.out.println("Строка содержит \"Java\": " + str.contains("Java"));
        System.out.println("Позиция подстроки \"Java\": " + str.indexOf("Java"));
        System.out.println("Замена символов а на о: " + str.replace('a', 'o'));
        System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + str.toLowerCase());
        int indexStart = str.indexOf("Java");
        int indexEnd = str.indexOf("Java") + 4;
        System.out.println("Вырезание строки \"Java\": " + str.substring(0, indexStart) + str.substring(indexEnd, str.length()-1));
    }
}