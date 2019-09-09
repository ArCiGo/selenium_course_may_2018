package com.qalabs.javabasics;

public class SwitchExample {
    public static void main (String[] args) {
        char browser = 'c';

        switch(browser) {
            case 'c' :
                System.out.println("Running on chrome");
                break;
            case 'f' :
                System.out.println("Running on firefox");
                break;
            default :
                System.out.println("Running on IE");
        }
    }
}




