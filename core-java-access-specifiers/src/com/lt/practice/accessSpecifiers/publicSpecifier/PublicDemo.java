package com.lt.practice.accessSpecifiers.publicSpecifier;

import com.lt.practice.accessSpecifiers.publicSpecifier.model.Student;

public class PublicDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 1;
        student.name = "Ram";
        student.city = "Pune";

        System.out.println("student = " + student);
    }
}
