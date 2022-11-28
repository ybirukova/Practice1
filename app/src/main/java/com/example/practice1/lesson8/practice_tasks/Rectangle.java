package com.example.practice1.lesson8.practice_tasks;

public class Rectangle extends Triangle{
    int side2;

    public Rectangle(int side, int side2) {
        super(side);
        this.side2 = side2;
    }

    @Override
    public int getSquare() {
        return super.getSide()*side2;
    }
}