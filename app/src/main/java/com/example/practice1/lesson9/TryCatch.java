package com.example.practice1.lesson9;

import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        String[] str = new String[1];

        try {
            System.out.println(str[1]);
        } catch (StackOverflowError e) {
            System.out.println("stack is overflow");
        } catch (IndexOutOfBoundsException ie) {
            ie.printStackTrace();
        } finally {
            System.out.println("the end");
        }

        try (FileReader fr = new FileReader("D:\\New Text Document.txt")) {
            char[] arr = new char[10];
            fr.read(arr);
            for (char c : arr) {
                System.out.println(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("inside main: ");
        try {
            tryError();
        } catch (NullPointerException e1) {
            System.out.println("throw error " + e1);
        }
    }

    static void tryError() throws NullPointerException {
        throw new NullPointerException();
    }
}