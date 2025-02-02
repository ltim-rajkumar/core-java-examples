package com.lt.practice.contructorDemo;

public class ParameterizedConstructorDemo {

    /**
     * Constructor:
     * Two types
     * 1) Default - Java has default constructor to class, no need create.
     * 2) Parameterized - We can pass parameter to constructor to set values while instance creation.
     *
     * Rules:
     * 1) Constructor name must be same as class name.
     * 2) Constructor always have `public` access specifier by default.
     * 3)
     */

    public static void main(String[] args) {
//        Train train1 = new Train(); // This blank type of constructor is a default constructor
//        train1.setNumber(1221);
//        train1.setName("Vande Bharat - Mumbai-Solapur-Mumbai");

        // This type of constructor is a parameterized constructor
        TrainParameterized train = new TrainParameterized(1231, "Vande Bharat - Mumbai-Kolhapur-Mumbai");
        System.out.println("Print train using parameterized constructor = " + train);
    }

}
