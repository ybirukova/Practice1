package com.example.practice1.lesson10.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Document {
    public static final String PATTERN_LETTERS = "[A-Za-z]{1,10}";
    public static final String PATTERN_NUMBERS = "[\\d]{1,10}";

    public static String createNumberOfDoc() throws WrongDocNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x — число, а y — латинская буква.");
        String docNumber = scanner.nextLine();

        try {
            if (checkDocNumber(docNumber)) {
                System.out.println("Номер документа верный.");
            }
        } catch (StringIndexOutOfBoundsException | WrongDocNumberException indexOut) {
            System.out.println(indexOut);
            createNumberOfDoc();
        }

        return docNumber;
    }

    public static boolean checkDocNumber(String docNumber) throws WrongDocNumberException {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder hyphens = new StringBuilder();
        char[] charArray = docNumber.toCharArray();

        for (char docChar : charArray) {
            String charToString = String.valueOf(docChar);
            if (Pattern.matches(PATTERN_LETTERS, charToString)) {
                letters.append(docChar);
            } else if (Pattern.matches(PATTERN_NUMBERS, charToString)) {
                numbers.append(docChar);
            } else if (Pattern.matches("-", charToString)) {
                hyphens.append(docChar);
            }
        }
        boolean isLengthCorrect = ((letters.length() == 8) && (numbers.length() == 10) && (hyphens.length() == 4));

        String lettersOnPos = docNumber.substring(5, 8) + docNumber.substring(14, 17) + docNumber.charAt(19) + docNumber.charAt(21);
        String numbersOnPos = docNumber.substring(0, 4) + docNumber.substring(9, 13) + docNumber.charAt(18) + docNumber.charAt(20);
        String hyphensOnPos = ("" + docNumber.charAt(4) + docNumber.charAt(8) + docNumber.charAt(13) + docNumber.charAt(17));
        boolean isLettersPosCorrect = Pattern.matches(PATTERN_LETTERS, lettersOnPos);
        boolean isNumbersPosCorrect = Pattern.matches(PATTERN_NUMBERS, numbersOnPos);
        boolean isHyphensPosCorrect = Pattern.matches("----", hyphensOnPos);
        if (!((isLettersPosCorrect) && (isNumbersPosCorrect) && (isHyphensPosCorrect))) {
            throw new WrongDocNumberException("Номер документа не соответсвует формату.");
        } else if (!isLengthCorrect) {
            throw new WrongDocNumberException("Номер документа не соответсвует формату.");
        }

        return true;
    }

    public static void getFirst8Numbers(String docNumber) {
        String first8Numbers = docNumber.substring(0, 4) + " " + docNumber.substring(9, 13);
        System.out.println("Два первых блока по 4 цифры: " + first8Numbers);
    }

    public static void changeLetters(String docNumber) {
        String newDocNumber = docNumber.substring(0, 5) + "***" + docNumber.substring(8, 14) + "***" + docNumber.substring(17);
        System.out.println("Номер документа (блоки из трех букв -> ***): " + newDocNumber);
    }

    public static void printLetters(String docNumber) {
        StringBuilder str = new StringBuilder(docNumber.toUpperCase());
        str.deleteCharAt(20);
        str.delete(17, 19);
        str.delete(8, 14);
        str.delete(0, 5);
        str.insert(3, "/");
        str.insert(7, "/");
        str.insert(9, "/");

        System.out.println("Letters: " + str);
    }

    public static void checkContaining(String docNumber, String substring) {
        String docNumberLC = docNumber.toLowerCase();
        String substringLC = substring.toLowerCase();
        if (docNumberLC.contains(substringLC)) {
            System.out.println(docNumber + " содержит в себе " + substring + " (независимо от регистра).");
        } else
            System.out.println(docNumber + " не содержит в себе " + substring + " (независимо от регистра).");
    }

    public static void checkEndOfString(String docNumber) {
        String docNumberLC = docNumber.toLowerCase();
        String endStr = "1a2b";
        if (docNumberLC.endsWith(endStr)) {
            System.out.println(docNumber + " заканчивается на " + endStr + " (независимо от регистра).");
        } else
            System.out.println(docNumber + " не заканчивается на " + endStr + " (независимо от регистра).");
    }
}