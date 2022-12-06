package com.example.practice1.lesson10.homework;

public class WrongDocNumberException extends Exception {
    public WrongDocNumberException() {
    }

    public WrongDocNumberException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongDocNumberException{" +
                "message=" + getMessage() +
                '}';
    }
}