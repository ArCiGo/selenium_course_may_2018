package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        /*int age = 27;
        assert age >= 18;
        assert  1 > 5: "Un minuto no menos 5 minutos";
        */

        String cad1 = "plus ultra";
        String cad2 = "ultra plus";
        assert cad2.equals(cad1): "no son iguales";
        /* int num1 = 201;
        String num2 =" 201";
        int parsingnum = Integer.parseInt(num2);
        assert num1 == parsingnum : "Son iguales";

        int rangsup = 9;
        int ranginf = 1;
        int num3 = 10;
        */
    }
}
