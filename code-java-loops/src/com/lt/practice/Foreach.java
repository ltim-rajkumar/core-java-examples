package com.lt.practice;

public class Foreach {
    public static void main(String[] args) {

    int[] marks = new int[5];
        marks[0] = 75;
        marks[1] = 90;
        marks[2] = 91;
        marks[3] = 79;

        for(int mark: marks) {
            System.out.println("mark = " + mark);
        }
    }
}
