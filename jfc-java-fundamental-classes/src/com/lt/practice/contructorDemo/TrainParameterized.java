package com.lt.practice.contructorDemo;

public class TrainParameterized {
    private int number;
    private String name;

    @Override
    public String toString() {
        return "Train{" +
                " number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    // Parameterized constructor
    public TrainParameterized(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
