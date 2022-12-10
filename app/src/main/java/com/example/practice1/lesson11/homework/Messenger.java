package com.example.practice1.lesson11.homework;

public class Messenger {
    public static void main(String[] args) {
        while (true) {
            MessengerUtil.doCommand(MessengerUtil.chooseCommand());
        }
    }
}