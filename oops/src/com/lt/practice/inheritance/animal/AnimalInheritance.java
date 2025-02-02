package com.lt.practice.inheritance.animal;

import com.lt.practice.inheritance.animal.service.DogService;

public class AnimalInheritance {

    public static void main(String[] args) {
        DogService dogService = new DogService();

        dogService.makeSound();

        dogService.bark();

    }

}
