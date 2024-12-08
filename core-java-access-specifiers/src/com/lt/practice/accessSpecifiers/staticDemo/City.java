package com.lt.practice.accessSpecifiers.staticDemo;

public class City {
    static String cityName;

    public static String getCityName() {
        cityName = "Pune";
        return cityName;
    }
}
