package com.example.practice1.lesson11.homework;

import java.util.LinkedList;
import java.util.Queue;

public class User {
    private String userName;
    private Queue<String> messages= new LinkedList<>();

    User(String userName) {
        this.userName = userName;
    }

    String getUserName() {
        return userName;
    }

    Queue<String> getMessages() {
        return messages;
    }

    void writeToUser(String textOfMessage) {
        messages.add(textOfMessage);
    }

    void readAndDeleteMessage() {
        if (messages.peek() != null) {
            System.out.println("Входящее сообщение: " + messages.poll());
            System.out.println("Сообщение прочитано и удалено.");
        } else System.out.println("У пользователя нет новых сообщений");
    }
}