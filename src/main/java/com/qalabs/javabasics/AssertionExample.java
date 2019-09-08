package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        /*int age = 27;
        assert age >= 18;
        assert  1 > 5: "Un minuto no menos 5 minutos";*/

        // check if two string are equals
        /*String s1 = "Armando";
        String s2 = "Eduardo";

        assert s1.equals(s2) : "No son iguales";*/

        // check if an integer is a string
        /*int n1 = 1;
        String s3 = "5";
        int parsingNumber = Integer.parseInt(s3);

        assert parsingNumber == n1 : "No son iguales";*/

        // Check if number is in between a range of numbers
        /*int n2 = -4;
        assert (n2 > 0 && n2 < 10) : "No está dentro del rango";*/

        //assert substract(5, 10) == -5 : "El resultado no es el esperado";
    }

    public static int substract(int a, int b) {
        return a - b;
    }
}



