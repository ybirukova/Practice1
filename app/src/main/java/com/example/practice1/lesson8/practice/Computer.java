package com.example.practice1.lesson8.practice;

public class Computer implements InOutInterface{
    @Override
    public void print() {
        System.out.println("Computer prints.");
    }

    @Override
    public void write() {
        System.out.println("Computer writes.");
    }
}
