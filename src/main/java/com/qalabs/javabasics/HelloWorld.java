package com.qalabs.javabasics;

<<<<<<< HEAD
=======
import org.junit.Test;

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
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

