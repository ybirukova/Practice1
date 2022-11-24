package com.example.practice1.study7.task2;

public class AppAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];
        animals[0] = new Cat("Bob", "meatballs", "Minsk");
        animals[1] = new Dog("Jack", "cracks", "Mogilev");
        animals[2] = new Dog("Katty", "Chips", "Brest");
        animals[3] = new Duck("Yellow", "grass", "Dnepr");
        animals[4] = new Cat("Sam", "milk", "Grodno");
        animals[5] = new Duck("Red", "fish", "Neman");

        for (Animal animal : animals) {
            animal.sound();
        }

        Doctor doctor = new Doctor();
        for (Animal animal : animals) {
            doctor.treatAnimal(animal);
        }
    }
}