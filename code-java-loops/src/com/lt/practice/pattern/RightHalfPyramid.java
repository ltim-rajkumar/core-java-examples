package com.lt.practice.pattern;

public class RightHalfPyramid {
    public static void main(String[] args) {

        /*
        Pseudocode: Print following pattern

        *
        **
        ***
        ****
        *****

        */

        for(int i = 0; i < 5; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
