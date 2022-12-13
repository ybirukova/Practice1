package com.example.practice1.lesson12.homework;

import java.util.HashMap;
import java.util.Scanner;

public class App {
    private static HashMap<String, Pet> animals = new HashMap<>();
    private static final String MESSAGE_TO_ENTER_ANIMAL_TO_DELETE = "Введите имя животного, которое хотите удалить из списка.";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Pet cat1 = new Cat("Bob", "No breed", 5);
        Pet cat2 = new Cat("Tom", "Persian", 11);
        Pet dog1 = new Dog("Jack", "corgi", "Katty");
        Pet dog2 = new Dog("Sherlock", "Collie", "Alex");
        Pet horse1 = new Horse("Dandelion", "Arabian", "brown");

        animals.put(cat1.getName(), cat1);
        animals.put(cat2.getName(), cat2);
        animals.put(dog1.getName(), dog1);
        animals.put(dog2.getName(), dog2);
        animals.put(horse1.getName(), horse1);

        printInfoAboutAllAnimals();
        System.out.println(MESSAGE_TO_ENTER_ANIMAL_TO_DELETE);
        enterAnimalAndDeleteFromHashMap();
        printInfoAboutAllAnimals();
    }

    private static void printInfoAboutAllAnimals() {
        System.out.println("Список животных:");
        int i = 1;
        for (Pet pet : animals.values()) {
            System.out.print(i + ". ");
            pet.printInfoAboutAnimal();
            i++;
        }
    }

    private static void enterAnimalAndDeleteFromHashMap() {
        while (true) {
            String animalNameToDelete = SCANNER.nextLine();
            if (animals.containsKey(animalNameToDelete)) {
                animals.remove(animalNameToDelete);
                System.out.println("Животное с именем " + animalNameToDelete + " успешно удалено.");
                break;
            } else {
                System.out.println("Некорректный ввод. Повторите операцию.");
            }
        }
    }
}