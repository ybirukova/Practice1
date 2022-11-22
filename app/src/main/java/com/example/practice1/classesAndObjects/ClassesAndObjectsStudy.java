package com.example.practice1.classesAndObjects;

public class ClassesAndObjectsStudy {
    public static void main(String[] args) {
        PersonWithCar personWithCar = new PersonWithCar("Maria", 25);
        personWithCar.sayMyName();

        System.out.println("Age: " + personWithCar.getAge());

        //задача1 человек+машина classes PersonWithCar, Car
        Car car = new Car("toyota");
        PersonWithCar personWithCar1 = new PersonWithCar("Maria", 25, car);
        System.out.println("Какая у тебя машина?");
        personWithCar1.nameYourCar();

        //задача2 person talk, person move class Person
        Person person1 = new Person();
        Person person2 = new Person("Yana Birukova", 28);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();

        //задача3 reader&books classes Reader, Book
        Reader reader = new Reader("Yana B.", 1111, "Architecture",
                "04.12.1993", "+375291111111");
        Book book1 = new Book("Dandelion Wine", "Ray Bradbury");
        Book book2 = new Book("Fahrenheit 451", "Ray Bradbury");
        Book book3 = new Book("Flowers for Algernon", "Daniel Keyes");

        reader.printInfo();
        reader.takeBook(book1,book2);
        reader.returnBook(book2,book1);
        reader.takeBook("Stories", "Detective");
    }
}
