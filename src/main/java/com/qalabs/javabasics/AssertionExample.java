package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 27;
        assert age >= 18;
        assert  1 > 5: "Un minuto no menos 5 minutos";

        // String cadena = "Buenos días";
        // assert cadena.equals("Buenos días");
        // assert cadena.equals("Buenas noches") : "La cadena es buenos días";

        //If an integer is equals to string

        // String numStr = "18";
        // int num1 = Interger.parseInt(numStr);
        // int num2 = 18;
        // assert num1 == num2;
        // assert num1 != num2 : "Los datos son iguales";

        // If number is between a range

        //int num = 25;
        // assert ((num >=10) && (num <=100));
        // assert num > 101: "El numero esta dentro del rango";

        //Create a new method called susbract whit two parameters number A and Number B
        //If should return A-B
        //Test your method using assert

        // int resultado = subsTract(a:10, b: 5);
        // System.out.println("El resultado de la restas es: " + resultado);
        // assert resultado > 0;
        // assert resultado < 0: "El resultado es positivo";
    }public static int subTract (int a, int b) {return a - b;}

}


