package com.example.practice1.lesson10.homework;

public class App {
    public static void main(String[] args) throws WrongDocNumberException {
        String docNumber = Document.createNumberOfDoc();
        Document.getFirst8Numbers(docNumber);
        Document.changeLetters(docNumber);
        Document.printLetters(docNumber);
        Document.checkContaining(docNumber, "aBc");
        Document.checkEndOfString(docNumber);
    }
}