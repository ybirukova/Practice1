package com.example.practice1.lesson8.practice_tasks;

public class Circle extends Figure{
    public Circle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        int square = (int) (3.14 * Math.pow(super.getSide(), 2));
        return square;
    }
}