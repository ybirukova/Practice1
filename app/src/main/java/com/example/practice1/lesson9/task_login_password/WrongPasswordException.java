package com.example.practice1.lesson9.task_login_password;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "message=" + getMessage() +
                '}';
    }
}