package com.example.practice1.lesson15;

public class App {
    public static void main(String[] args) {
        PeopleQueue peopleQueue = new PeopleQueue();
        Bus bus = new Bus(peopleQueue);
        People people = new People(peopleQueue, bus);

        peopleQueue.setAmountOfSeatsConsole();
        new Thread(bus).start();
        new Thread(people).start();
    }
}
