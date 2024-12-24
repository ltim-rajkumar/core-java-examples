package com.lt.practice.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ListCollection {

    public static void main(String[] args) {

        String city = "Pune City";
        String[] cities = new String[2];
        cities[0] = "Pune";
        cities[1] = "Mumbai";

        String[] cities1 = {"Satara", "PCMC"};

        ArrayList cityList = new ArrayList();
        cityList.add("Delhi");
        cityList.add("Banglore");
        cityList.add(11);
        cityList.add(true);

        System.out.println("city = " + city);
        System.out.println("cities = " + Arrays.stream(cities).toList());
        System.out.println("cities1 = " + Arrays.stream(cities1).toList());
        System.out.println("cityList = " + cityList);
    }

}
