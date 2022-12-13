package com.example.practice1.lesson7.task3;

public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    String getScholarship() {
        String money;
        if (getAverageMark() == 5) {
            money = "200 $";
        } else money = "180 $";
        return money;
    }
}