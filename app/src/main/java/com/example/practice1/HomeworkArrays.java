package com.example.practice1;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        createArrayOfNames();
    }

    static void createArrayOfNames (){
        String[] arrayOfNames = new String[]{"Yana", "Max", "Maria", "Helga", "Anna", "Timur", "Egor"};
        Arrays.sort(arrayOfNames);
        System.out.println(Arrays.toString(arrayOfNames));
    }
}
