package com.example.practice1.lesson8.practice;

public class App {
    public static void main(String[] args) {
        Book book = new Book();
        book.print();
        Magazine magazine = new Magazine();
        magazine.print();

        Computer computer = new Computer();
        computer.print();
        computer.write();

        Walkable someObj = new Walkable(){
            @Override
            public void walk() {
                System.out.println("Walking...");
            }
        };

        someObj.walk();
    }
}
