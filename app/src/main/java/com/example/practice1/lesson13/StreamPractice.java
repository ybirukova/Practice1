package com.example.practice1.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<String> employeeList = new ArrayList<>();
        employeeList.add("Yana");
        employeeList.add("Roma");
        employeeList.add("Denis");
        employeeList.add("Mikita");
        employeeList.add("Dana");
        employeeList.add("Arsenii");
        employeeList.add("Misha");

        for (String employee : employeeList) {
            System.out.println(employee);
        }
        List<String> filtredList = employeeList.stream()
                .filter(name -> name.startsWith("M"))
                .collect(Collectors.toList());

        System.out.println();
        for (String employee : filtredList) {
            System.out.println(employee);
        }
    }
}