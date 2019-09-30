package com.qalabs.javabasics;

<<<<<<< HEAD

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
=======
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
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b

}


<<<<<<< HEAD
=======

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
