package com.lt.practice.abstraction.service;

public class SBIBankService extends BankService {

    @Override
    public void disburseLoan() {
        System.out.println("Loan is being disbursed with SBI guidelines!!!");
    }

    public void openAccount() {
        System.out.println("Account opened by SBI Bank!!!");
    }
}
