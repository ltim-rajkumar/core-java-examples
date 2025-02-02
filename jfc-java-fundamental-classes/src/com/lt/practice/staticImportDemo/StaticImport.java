package com.lt.practice.staticImportDemo;

//import com.lt.practice.staticImportDemo.service.StaticImportDemoService;
import static com.lt.practice.staticImportDemo.service.StaticImportDemoService.sayHello;

public class StaticImport {

    /**
     *  We can use any public/protected static method using import
     *  - In general try to avoid this way
     *  - It will cause issue in multi-threading
     *
     */

    public static void main(String[] args) {
//        StaticImportDemoService.sayHello("Rajkumar");
        sayHello("Rajkumar"); // Call method directly
    }

}
