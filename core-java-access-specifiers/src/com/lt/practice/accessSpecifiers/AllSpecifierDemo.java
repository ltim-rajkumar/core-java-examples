package com.lt.practice.accessSpecifiers;

import com.lt.practice.accessSpecifiers.defaultSpecifier.City;
import com.lt.practice.accessSpecifiers.privateSpecifier.model.Vehicle;
import com.lt.practice.accessSpecifiers.protectedSpecifier.model.Building;
import com.lt.practice.accessSpecifiers.publicSpecifier.model.Student;

public class AllSpecifierDemo {

    public static void main(String[] args) {

        AllSpecifierDemo allSpecifierDemo = new AllSpecifierDemo();
        System.out.println("Public specifier demo");
        allSpecifierDemo.publicSpecifierDemo();

        System.out.println("Private specifier demo");
        allSpecifierDemo.privateSpecifierDemo();

        System.out.println("Protected specifier demo");
        allSpecifierDemo.protectedSpecifierDemo();

        System.out.println("Default specifier demo");
        allSpecifierDemo.defaultSpecifierDemo();
    }

    void publicSpecifierDemo() {
        Student stud = new Student();
        stud.id = 1;
        stud.name = "Rajkumar";
        stud.city = "Pune";

        System.out.println("Student: " + stud);
    }

    void privateSpecifierDemo() {
        Vehicle vehicle = new Vehicle();
//        vehicle.id = 1; // If you uncomment this line will get ERROR: 'id' has private access in 'com. lt. practice. accessSpecifiers. privateSpecifier. model. Vehicle'
//        To access private specifiers outside the class we need to use getter and setter method

        vehicle.setId(1);
        vehicle.setName("BMW");
        vehicle.setModel("2024");

        System.out.println("vehicle = " + vehicle);
    }

    void protectedSpecifierDemo() {
        Building building = new Building();
//        building.id = "2"; // If you uncomment this line will get ERROR: 'id' has protected access in 'com. lt. practice. accessSpecifiers. protectedSpecifier. model. Building'
        // Because protected specifier can't be accessed outside package

//        To access protected specifiers outside the package we need to use getter and setter method

        building.setId(2);
        building.setName("SP Tower");
        building.setCity("Mumbai");

        System.out.println("building = " + building);
    }

    void defaultSpecifierDemo() {
        City city = new City();
//        city.id = 1;// If you uncomment this line will get ERROR: 'id' is not public in 'com. lt. practice. accessSpecifiers. defaultSpecifier. City'. Cannot be accessed from outside package
    
        city.setId(1);
        city.setName("Hinjwadi");
        city.setState("MH");
        city.setPinCode(411057);

        System.out.println("city = " + city);
        
    }


}
