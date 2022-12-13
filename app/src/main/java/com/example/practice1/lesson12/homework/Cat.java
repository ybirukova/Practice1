package com.example.practice1.lesson12.homework;

import java.util.Objects;

public class Cat extends Pet {
    private int age;

    public Cat(String name, String breed, int age) {
        super(name, breed);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(super.getName(),
                cat.getName()) && Objects.equals(super.getBreed(), cat.getBreed());
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, super.getName(), super.getBreed());
    }
}