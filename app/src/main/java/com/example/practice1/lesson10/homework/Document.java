package com.example.practice1.lesson10.homework;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Document {
    private static final String PATTERN_LETTERS = "[A-Za-z]{1,10}";
    private static final String PATTERN_NUMBERS = "[\\d]{1,10}";
    private static final int LETTERS_LENGTH = 8;
    private static final int NUMBERS_LENGTH = 10;
    private static final int HYPHENS_LENGTH = 4;
    private static final int[] LETTER_POS = {5, 8, 14, 17, 19, 21};
    private static final int[] NUMBER_POS = {0, 4, 9, 13, 18, 20};
    private static final int[] HYPHEN_POS = {4, 8, 13, 17};
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String START_PHRASE = "Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy, где x — число, а y — латинская буква.";

    public static String enterNumberOfDoc() {
        String docNumber;
        System.out.println(START_PHRASE);
        while (true) {
            docNumber = SCANNER.nextLine();
            try {
                if (checkDocNumber(docNumber)) {
                    System.out.println("Номер документа верный.");
                    break;
                } else System.out.println("Номер документа неверный.");
            } catch (StringIndexOutOfBoundsException | WrongDocNumberException exc) {
                System.out.println(exc);
                System.out.println(START_PHRASE);
            }
        }
        return docNumber;
    }

    private static boolean checkDocNumber(String docNumber) throws WrongDocNumberException {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder hyphens = new StringBuilder();

        for (int i = 0; i < docNumber.length(); i++) {
            String charToString = String.valueOf(docNumber.charAt(i));
            if (Pattern.matches(PATTERN_LETTERS, charToString)) {
                letters.append(docNumber.charAt(i));
            } else if (Pattern.matches(PATTERN_NUMBERS, charToString)) {
                numbers.append(docNumber.charAt(i));
            } else if (Pattern.matches("-", charToString)) {
                hyphens.append(docNumber.charAt(i));
            }
        }

        boolean isLengthCorrect = ((letters.length() == LETTERS_LENGTH)
                && (numbers.length() == NUMBERS_LENGTH)
                && (hyphens.length() == HYPHENS_LENGTH));

        String lettersOnPos = docNumber.substring(LETTER_POS[0], LETTER_POS[1]) + docNumber.substring(LETTER_POS[2], LETTER_POS[3]) + docNumber.charAt(LETTER_POS[4]) + docNumber.charAt(LETTER_POS[5]);
        String numbersOnPos = docNumber.substring(NUMBER_POS[0], NUMBER_POS[1]) + docNumber.substring(NUMBER_POS[2], NUMBER_POS[3]) + docNumber.charAt(NUMBER_POS[4]) + docNumber.charAt(NUMBER_POS[5]);
        String hyphensOnPos = ("" + docNumber.charAt(HYPHEN_POS[0]) + docNumber.charAt(HYPHEN_POS[1]) + docNumber.charAt(HYPHEN_POS[2]) + docNumber.charAt(HYPHEN_POS[3]));
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

    private static void getFirst8Numbers(String docNumber) {
        String first8Numbers = docNumber.substring(0, 4) + " " + docNumber.substring(9, 13);
        System.out.println("Два первых блока по 4 цифры: " + first8Numbers);
    }

    private static void hideLetters(String docNumber) {
        String newDocNumber = docNumber.substring(0, 5) + "***" + docNumber.substring(8, 14) + "***" + docNumber.substring(17);
        System.out.println("Номер документа (блоки из трех букв -> ***): " + newDocNumber);
    }

    private static void printLetters(String docNumber) {
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

    private static void checkContaining(String docNumber, String substring) {
        if (docNumber.matches("(?i).*" + substring + ".*")) {
            System.out.println(docNumber + " содержит в себе " + substring + " (независимо от регистра).");
        } else
            System.out.println(docNumber + " не содержит в себе " + substring + " (независимо от регистра).");
    }

    private static void checkEndOfString(String docNumber) {
        String docNumberLC = docNumber.toLowerCase();
        String endStr = "1a2b";
        if (docNumberLC.endsWith(endStr)) {
            System.out.println(docNumber + " заканчивается на " + endStr + " (независимо от регистра).");
        } else
            System.out.println(docNumber + " не заканчивается на " + endStr + " (независимо от регистра).");
    }

    public static void printInfoDocNumber(String docNumber) {
        getFirst8Numbers(docNumber);
        hideLetters(docNumber);
        printLetters(docNumber);
        checkContaining(docNumber, "aBc");
        checkEndOfString(docNumber);
    }
}