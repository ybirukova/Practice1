package com.example.practice1.lesson9.task_login_password;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "message=" + getMessage() +
                '}';
    }
}