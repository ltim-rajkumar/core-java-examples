package com.lt.practice.staticImportDemo.service;

public class StaticImportDemoService {

    public static void sayHello(String name) {
        System.out.println("Hello " + (name.isEmpty() ? "world !!!" : "!!!"));
    }
}
