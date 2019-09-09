package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 27;
        assert age >= 18;
   //     assert  1 > 5: "Un minuto no menos 5 minutos";
        assert "S" == "S": "La 'S' no es igual";
        Integer ent = 1;
        String num = "1";
        assert num.equals(ent): "El int y el String no son iguales";
        assert 8 > 5 && 8 < 10: "El 8 no esta entre el 5 y el 10";
        assert subract(5, 2) == 5: "El resultado no es igual";

        System.out.println("Resta: " + subract(5, 2));
    }

    public static int subract(int a, int b) {
        return (a - b);
    }
}



