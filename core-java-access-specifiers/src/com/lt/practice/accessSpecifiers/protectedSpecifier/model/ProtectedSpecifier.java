package com.lt.practice.accessSpecifiers.protectedSpecifier.model;


public class ProtectedSpecifier {

    public static void main(String[] args) {
        Building building = new Building();
        building.id = 1;
        building.name = "BelaCasa";
        building.city = "Pune";

        System.out.println("Building = " + building);
    }
}
