package com.example.practice1.homework4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1001, 5000);
        CreditCard creditCard2 = new CreditCard(1002, 100);
        CreditCard creditCard3 = new CreditCard(1003, 2000);

        creditCard1.printCurrentInfo();
        creditCard2.printCurrentInfo();
        creditCard3.printCurrentInfo();

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount to replenish the account " + creditCard1.getAccountNumber());
        int sum1 = in.nextInt();
        System.out.println("Enter the amount to replenish the account " + creditCard2.getAccountNumber());
        int sum2 = in.nextInt();
        System.out.println("Enter the amount to withdraw from the account " + creditCard3.getAccountNumber());
        int sum3 = in.nextInt();

        creditCard1.plusSum(sum1);
        creditCard2.plusSum(sum2);
        creditCard3.minusSum(sum3);

        creditCard1.printCurrentInfo();
        creditCard2.printCurrentInfo();
        creditCard3.printCurrentInfo();
    }
}