package com.lt.practice.array;

import java.util.Arrays;

public class StringArrayDemo {
    public static void main(String[] args) {

        String city = "Pune City";
        System.out.println("city = " + city);

        String[] cities = new String[2];
        cities[0] = "Pune";
        cities[1] = "Mumbai";
        System.out.println("cities later assignment = " + Arrays.toString(cities));
        System.out.println("---------------------");

        final String[] cities1 = {"Satara", "PCMC"};
        System.out.println("---------------------");
        System.out.println("String cities: " + Arrays.toString(cities1));
    }
}
