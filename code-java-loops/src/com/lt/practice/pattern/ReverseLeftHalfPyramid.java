package com.lt.practice.pattern;

public class ReverseLeftHalfPyramid {
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
            for (int j = 0; j < 5; j++) {
                System.out.print("i="+i+":"+"j="+j+"   ");
            }
            System.out.println();
            System.out.println("-----------------------------------------------");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i<=j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
