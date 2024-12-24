package com.lt.practice.array;

public class IntArrayDemo {

    public static void main(String[] args) {
        int marks[] = new int[4];
        marks[0] = 77;
        marks[1] = 90;
        marks[2] = 72;
        
        for(int mark: marks) {
            System.out.println("mark = " + mark);
        }
    }
    
}
