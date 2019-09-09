package com.qalabs.javabasics;

public class ControlStatementExample {
    public static void main (String[] args) {
        int num = 5;
        if(num >= 8) {
            System.out.println("Excellent");
        } else if (num >= 5 && num < 8) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }
    }
}



