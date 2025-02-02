package com.lt.practice;

public class BoxingUnboxing {
    public static void main(String[] args) {

        /**
         * auto-boxing
         * Autoboxing is the automatic conversion that the Java compiler makes between
         * the primitive types and their corresponding object wrapper classes.
         *
         * For example, converting an int to an Integer, a double to a Double, and so on
         *
         * This feature was introduced in Java 5
         * to simplify the code and reduce the need for explicit conversion.
         */

        Object objectDoubleValue = 23521.2323;
//      double doubleValue = objectDoubleValue; // It will gives error
        double doubleValue = (double) objectDoubleValue;  // Autoboxing: object wrapper to double

        Integer iMarks = 71; // Autoboxing: int to Integer

        /**
         * unboxing - It parse data based on data, like in below case
         * doubleValue gets bind with Data: while print
         */

        System.out.println("Data: " + doubleValue);

        /**
        * unboxing eg 2
         *
        * */
        Integer i = new Integer(10); // Wrapper class object
        int j = i; // Unboxing from i to j
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);



    }
}
