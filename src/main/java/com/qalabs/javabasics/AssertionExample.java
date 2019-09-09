package com.qalabs.javabasics;

public class AssertionExample {
    public static void main (String[] args)

    {
        //int age = 27;
       // assert age >= 18;
       // assert  1 > 5: "Un minuto no menos 5 minutos";

        //if two string are equal

       // String cadena = "hola";
       // assert cadena.equals("hola");
       // assert cadena.equals("adios") : "the string are equal";

        // if an integer is equal to string

        // String numStr = "35";
        // int numInt1 = Integer.parseInt(numStr);
        // int numInt2=35;
        //assert numInt1 == numInt2;
        //assert numInt1 != numInt2 : "integer is equal to string";

        //if a number is between a range

        //int num = 21;
        // assert ((num >= 10) && (num <= 100));
        // assert  num > 101: "the number is between a range";

        //create a new method called subTract with two parameters number A and number B
        //if should return A-B
        //test your new method using assert

        int resultado= subTract(10,5);
        System.out.println("El resultado de la resta es: "+resultado);
        assert resultado > 0;
        assert resultado < 0: "the result is positive";
        }

    public static int subTract (int a, int b) {
        return a - b;
    }

}



