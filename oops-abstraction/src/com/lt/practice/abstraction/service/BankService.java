package com.lt.practice.abstraction.service;

public abstract class BankService {

    public abstract void disburseLoan();

    public void openAccount() {
        System.out.println("Thanks for opened account with us!!!");
    }

}
