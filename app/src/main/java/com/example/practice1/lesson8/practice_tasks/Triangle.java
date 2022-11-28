package com.example.practice1.lesson8.practice_tasks;

public class Triangle extends Figure {
    public Triangle(int side) {
        super(side);
    }

    @Override
    public int getSquare() {
        int square = (int) ((Math.pow(getSide(), 2) * Math.sqrt(3)) / 4);
        return square;
    }
}