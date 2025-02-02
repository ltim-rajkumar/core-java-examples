package com.lt.practice.inheritance.vehical;

import com.lt.practice.inheritance.vehical.service.CarService;

public class VehicalInheritance {

    public static void main(String[] args) {
        CarService carService = new CarService();
        carService.move();
        carService.speed();
    }
}
