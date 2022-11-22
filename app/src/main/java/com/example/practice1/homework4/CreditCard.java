package com.example.practice1.homework4;

public class CreditCard {
    int accountNumber;
    int currentBalance;

    public CreditCard(int accountNumber, int currentSum) {
        this.accountNumber = accountNumber;
        this.currentBalance = currentSum;
    }

    int plusSum(int sum) {
        return currentBalance += sum;
    }

    int minusSum(int sum) {
        return currentBalance -= sum;
    }

    void printCurrentInfo() {
        System.out.println("Account number: " + accountNumber + ". Current balance: " + currentBalance + " $");
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}