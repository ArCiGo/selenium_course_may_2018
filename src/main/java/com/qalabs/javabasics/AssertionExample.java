package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 27;
        assert age >= 18;
        //assert  1 > 5: "Un minuto no menos 5 minutos";

        String s1 = "hola";
        String s2 = "hola";
        String s3 = "hola2";
        assert s1.equals(s2) : "No son iguales";
        //assert s1.equals(s3) : "No son iguales";

        String s4 = "27";
        String s5 = "26";
        assert age == Integer.parseInt(s4) : "No son iguales";
        //assert age == Integer.parseInt(s5) : "No son iguales";

        int n2 = 9;
        assert (age > 10 && age < 30) : "El numero no esta dentro del rango";
        //assert (n2 > 10 && n2 < 30) : "El numero no esta dentro del rango";

        assert substract(10,5) == 5 : "El resultado no dio lo esperado";
        assert substract(10,5) == 4 : "El resultado no dio lo esperado";

    }

    public static int substract (int a, int b) {
        return a - b;
    }
}



