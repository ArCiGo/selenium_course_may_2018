package com.qalabs.javabasics;


class Automation {
    enum Tools{ SELENIUM, SOAPUI, POSTMAN }
    Tools size;
}

public class EnumExample {
    public static void main(String[] args) {
        Automation myAutomation = new Automation();
        myAutomation.size = Automation.Tools.SELENIUM;
        System.out.println("Automation tool: " + myAutomation.size);
    }
}
