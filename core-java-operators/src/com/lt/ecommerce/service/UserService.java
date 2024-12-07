package com.lt.ecommerce.service;

import com.lt.ecommerce.model.User;

import java.util.Scanner;

public class UserService {
    public User getUserData() {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user id: ");
        user.id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter user first name: ");
        user.firstName = scanner.nextLine();

        System.out.println("Enter user last name: ");
        user.lastName = scanner.nextLine();

        return user;
    }
}
