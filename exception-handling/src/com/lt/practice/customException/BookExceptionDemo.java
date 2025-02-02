package com.lt.practice.customException;

import java.util.Scanner;

public class BookExceptionDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InvalidBookException {

        System.out.println("Please enter book id: ");
        int bookId = 0;

        try {
            bookId = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException nfe) {
            throw new InvalidBookException("Invalid book id");
        }
        System.out.println("Yon have entered book id: " + bookId);
    }

}
