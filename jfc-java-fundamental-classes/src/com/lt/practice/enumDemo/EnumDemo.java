package com.lt.practice.enumDemo;

import java.util.Scanner;

public class EnumDemo {
    /**
     * Enum
     * - Enum used to hold universal values
     * - Enum don't have any type, enum it's a type
     *
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter temperature level:");
        System.out.println("Temprature Level.NORMAL = " + TempratureLevel.HIGH);
        System.out.println("Temprature Level.NORMAL = " + TempratureLevel.NORMAL);
        System.out.println("Temprature Level.LOW = " + TempratureLevel.LOW);
    }
}
