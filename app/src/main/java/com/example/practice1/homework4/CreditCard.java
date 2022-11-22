package com.example.practice1.homework4;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentSum;
    }

    void plusSum(int sum) {
        currentBalance += sum;
    }

    void minusSum(int sum) {
        if (sum > currentBalance) {
            printError();
        } else currentBalance -= sum;
    }

    void printError() {
        System.out.println("Insufficient funds.");
    }

    void printCurrentInfo() {
        System.out.println("Account number: " + accountNumber + ". Current balance: " + currentBalance + " $");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}