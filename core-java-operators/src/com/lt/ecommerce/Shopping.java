package com.lt.ecommerce;

import com.lt.ecommerce.model.User;
import com.lt.ecommerce.service.UserService;

public class Shopping {
    public static void main(String[] args) {

        System.out.println("---- Shopping ----");

        UserService userService = new UserService();
        User user = userService.getUserData();

        System.out.println("User details are:  " + user);
    }
}
