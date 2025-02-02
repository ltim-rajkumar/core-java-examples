package com.lt.practice.customException;

public class InvalidBookException extends Exception {
    public InvalidBookException(String message) {
        super(message);
    }
}
