package com.lt.practice.inheritance.company;

import com.lt.practice.inheritance.company.service.ManagerService;

public class ManagerInheritance {
    public static void main(String[] args) {
        ManagerService managerService = new ManagerService();
        managerService.speaks();
        managerService.walk();
        managerService.work();
        managerService.manage();
    }
}
