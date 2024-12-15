package com.lt.practice.pattern;

public class ReverseHalfPyramid {
     /*
        Pseudocode: Print following pattern

        *****
        ****
        ***
        **
        *

        */

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
