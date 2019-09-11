package com.qalabs.javabasics;

//import org.junit.Test;

class TestClass{
    private String name;
    TestClass(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello From QA Labs!");
        TestClass test = new TestClass(null);
        System.out.println(test.getName());
    }
}

