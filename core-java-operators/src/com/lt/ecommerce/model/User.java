package com.lt.ecommerce.model;

public class User {
    public Integer id;
    public String firstName;
    public String lastName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
