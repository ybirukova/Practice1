package com.example.practice1.lesson7.task3;

public class AppStudent {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Aspirant("Jack", "Bin", "112233", 4.4, "Math");
        students[1] = new Aspirant("Sam", "Gold", "112233", 5, "Math");
        students[2] = new Student("Katty", "Fake", "101022", 4);
        students[3] = new Student("Rose", "Black", "101022", 5);

        for (Student student : students) {
            String scholarship = student.getScholarship();
            System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getGroup() + " Scholarship: " + scholarship);
        }
    }
}