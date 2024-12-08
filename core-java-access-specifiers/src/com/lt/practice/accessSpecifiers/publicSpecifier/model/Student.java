package com.lt.practice.accessSpecifiers.publicSpecifier.model;

public class Student {
    public int id;
    public String name;
    public String city;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
