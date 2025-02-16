package com.lt.practice.serializationDeserialization;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                " Roll no: " + rollNo +
                ", Name: " + name + '\'' +
                ", Address: " + address +
                '}';
    }

    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    static class Address implements Serializable {
        String city;

        public Address(String city) {
            this.city = city;
        }

    }

}
