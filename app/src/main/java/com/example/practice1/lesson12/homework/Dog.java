package com.example.practice1.lesson12.homework;

import java.util.Objects;

public class Dog extends Pet {
    private String ownerName;

    public Dog(String name, String breed, String ownerName) {
        super(name, breed);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(ownerName, dog.ownerName) && Objects.equals(super.getName(),
                dog.getName()) && Objects.equals(super.getBreed(), dog.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName, super.getName(), super.getBreed());
    }
}