package com.lt.practice;

public class ExceptionHandling {
    public static void main(String[] args) {
        int no1 = 10, no2 = 0;
        int result = 0;
        try {
            result = no1 / no2;
        } catch (Exception e) {
            System.err.println("Division value must not be zero.");
        }

        System.out.println("Result: " + result);
    }
}
