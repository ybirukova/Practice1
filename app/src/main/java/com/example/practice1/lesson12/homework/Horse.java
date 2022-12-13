package com.example.practice1.lesson12.homework;

import java.util.Objects;

public class Horse extends Pet {
    private String color;

    public Horse(String name, String breed, String color) {
        super(name, breed);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(color, horse.color) && Objects.equals(super.getName(),
                horse.getName()) && Objects.equals(super.getBreed(), horse.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, super.getName(), super.getBreed());
    }
}