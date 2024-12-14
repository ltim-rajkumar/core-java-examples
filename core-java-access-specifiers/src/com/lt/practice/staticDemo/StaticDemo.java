package com.lt.practice.staticDemo;

public class StaticDemo {
    static int id;
    int age = 30;

    public static void main(String[] args) {
        id = 10;
        StaticDemo staticDemo = new StaticDemo();
        printDetails(); // This is the `static` method, invoke directly, no need to use object i.e. staticDemo
        staticDemo.displayDetails(); // This is the `non-static` method, to invoke it need to use object i.e. staticDemo
    }

    public static void printDetails() {
        System.out.println("printDetails: id = " + id);
    }

    public void displayDetails() {
        System.out.println("displayDetails");
        System.out.println("Age = " + age);
        System.out.println("City = " + City.getCityName());
    }

}
