package com.lt.practice.pattern;

public class NumberTrangular {
    /*
      Pseudocode: Print following pattern

         1
        2 2
       3 3 3
      4 4 4 4

      */

    public static void main(String[] args) {
        int spaceBefore = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if( (j!=i)) {
                    System.out.print("-");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }


    }
}
