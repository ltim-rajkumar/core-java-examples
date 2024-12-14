package com.lt.practice.staticDemo;

import java.util.Scanner;

public class AdvancedStaticDemo {

    static int staticNo;
    int nonStaticNo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number for static: ");

        staticNo = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter number for non-static: ");

        AdvancedStaticDemo obj1 = new AdvancedStaticDemo();
        obj1.nonStaticNo = Integer.parseInt(scanner.nextLine());;
        obj1.printStaticNo();

        AdvancedStaticDemo obj2 = new AdvancedStaticDemo();
        obj1.printStaticNo();

        obj1.staticNo = 25;

        obj2.printStaticNo();

    }

    public void printStaticNo() {
        System.out.println("Print number: " + staticNo + " -- nonStaticNo -- " + nonStaticNo);
    }
}
