package com.example.practice1.lesson8.practice_tasks;

abstract public class Figure implements Squarable{
    private int side;
    public Figure(int side){
        this.side=side;
    }

    int getSide(){
        return side;
    }
}