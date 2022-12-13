package com.example.practice1.lesson12.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pet cat1 = new Cat("Bob", "No breed", 5);
        Pet cat2 = new Cat("Tom", "Persian", 11);
        Pet dog1 = new Dog("Jack", "corgi", "Katty");
        Pet dog2 = new Dog("Sherlock", "Collie", "Alex");
        Pet horse1 = new Horse("Dandelion", "Arabian", "brown");

        putAnimalInHashMap(cat1);
        putAnimalInHashMap(cat2);
        putAnimalInHashMap(dog1);
        putAnimalInHashMap(dog2);
        putAnimalInHashMap(horse1);

        printInfoAboutAnimal();
        System.out.println(MESSAGE_TO_ENTER_ANIMAL_TO_DELETE);
        enterAnimalAndDeleteFromHashMap();
        printInfoAboutAnimal();
    }

    static HashMap<String, Pet> animals = new HashMap<>();
    static final String MESSAGE_TO_ENTER_ANIMAL_TO_DELETE = "Введите имя животного, которое хотите удалить из списка.";
    static final Scanner SCANNER = new Scanner(System.in);

    static void printInfoAboutAnimal() {
        System.out.println("Список животных:");
        int i = 1;
        for (Map.Entry<String, Pet> animal : animals.entrySet()) {
            if (animal.getValue() instanceof Cat) {
                System.out.println(i + ". Cat. Name: " + animal.getValue().getName() + " ; Breed: "
                        + animal.getValue().getBreed() + " ; Age" + ((Cat) animal.getValue()).getAge());
            } else if (animal.getValue() instanceof Dog) {
                System.out.println(i + ". Dog. Name: " + animal.getValue().getName() + " ; Breed: "
                        + animal.getValue().getBreed() + " ; Name of the owner: " + ((Dog) animal.getValue()).getOwnerName());
            } else if (animal.getValue() instanceof Horse) {
                System.out.println(i + ". Horse. Name: " + animal.getValue().getName() + " ; Breed: "
                        + animal.getValue().getBreed() + " ; Color: " + ((Horse) animal.getValue()).getColor());
            }
            i++;
        }
    }

    static void putAnimalInHashMap(Pet pet) {
        animals.put(pet.getName(), pet);
    }

    static void enterAnimalAndDeleteFromHashMap() {
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