package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        /*
        int age = 27;
        assert age >= 18;
        assert  1 > 5: "Un minuto no menos 5 minutos";
        */

        String text1 = "Hola Mundo";
        String text2 = "Hola Mundo";
        String text3 = "3";
        Integer test2 = 3;
        assert text1 == text2: "La cadena " + text1 + " no es igual a " + text2;
        //assert text3.equals(test2): "El entero no es igual a string";
        assert test2 > 0 && test2 < 4: "El entero no está dentro del rango" ;
        assert (4-2) == substract(4, 2): "No es igual";


    }

    public static int substract (int A, int B) {
        return A-B;
    }
}



