package com.example.practice1.classesAndObjects;

public class Reader {
    String fullName;
    int ticketNumber;
    String faculty;
    String birthData;
    String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty, String birthData, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthData = birthData;
        this.phoneNumber = phoneNumber;
    }

    void printInfo(){
        System.out.println("Info about the reader: " + fullName + " " + ticketNumber + " " + faculty + " " + birthData + " " + phoneNumber );
    }

    void takeBook() {
    }

    void returnBook() {
    }

    void takeBook(int bookAmount) {
        System.out.println(fullName + " took " + bookAmount + " books");
    }

    void takeBook(String ...bookName) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i< bookName.length; i++) {
            if (i != bookName.length-1)
                System.out.print(bookName[i] + ", ");
            else System.out.print(bookName[i] + ". ");
        }
        System.out.println();
    }

    void takeBook(Book ...book) {
        System.out.print(fullName + " took books: ");
        for (int i = 0; i< book.length; i++) {
            if (i != book.length-1)
                System.out.print(book[i].getBookName() +" (" + book[i].getAuthor() +"), ");
            else System.out.print(book[i].getBookName() +" (" + book[i].getAuthor() +").");
        }
        System.out.println();
    }

    void returnBook(int bookAmount) {
        System.out.println(fullName + " returned " + bookAmount + " books");
    }

    void returnBook(String ...bookName) {
        System.out.print(fullName + " returned: ");
        for (int i = 0; i< bookName.length; i++) {
            if (i != bookName.length-1)
                System.out.print(bookName[i] + ", ");
            else System.out.print(bookName[i] + ". ");
        }
        System.out.println();
    }

    void returnBook(Book ...book) {
        System.out.print(fullName + " returned: ");
        for (int i = 0; i< book.length; i++) {
            if (i != book.length-1)
                System.out.print(book[i].getBookName() +" (" + book[i].getAuthor() +"), ");
            else System.out.print(book[i].getBookName() +" (" + book[i].getAuthor() +").");
        }
        System.out.println();
    }




}
