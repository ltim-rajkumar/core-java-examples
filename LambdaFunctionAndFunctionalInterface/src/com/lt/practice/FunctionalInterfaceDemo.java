package com.lt.practice;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Calculate calculate = (no1, no2) -> no1 + no2; // Lambda function

        // Lambda function - Sum using reference :: operator default sum() method
        // Calculate calculate = Double::sum;

        System.out.println("Sum using Functional Interface And Lambda function");
        System.out.println("-------------------------");
        System.out.println("Sum of 75.5 + 22.14 = " + calculate.sum(75.5, 22.14));
        System.out.println("Sum of 10 + 11 = " + calculate.sum(10, 11));

        System.out.println("Append string using Functional Interface And Lambda function");
        System.out.println("-------------------------");

        StringAppender sp = (str1, str2) -> str1 + " " + str2;

        System.out.println(sp.append("Hello", "Java"));

    }

    @FunctionalInterface
    public interface Calculate {
        double sum(double no1, double no2);
    }

    @FunctionalInterface
    public interface StringAppender {
        String append(String str1, String str2);
    }

}
