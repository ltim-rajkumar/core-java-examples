package com.lt.practice.finalDemo;

public class FinalDemo {

    public final String GREETING_MSG = "Welcome...";
    public static final double DEFAULT_TEMPRATURE = 26.1;
    private final String CITY = "Pune";
    protected static int AGE = 30;
    protected static final double AGE_IN_MONTHS = 36.5;

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.printMessages();
    }

    public void printMessages() {
        System.out.println("GREETING_MSG = " + GREETING_MSG);
        System.out.println("DEFAULT_TEMPRATURE = " + DEFAULT_TEMPRATURE);
        System.out.println("CITY = " + CITY);
        System.out.println("AGE = " + AGE);
        System.out.println("AGE_IN_MONTHS = " + AGE_IN_MONTHS);
    }
}
