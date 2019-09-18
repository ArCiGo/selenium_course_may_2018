package com.qalabs.javabasics;

public class WhileExample {
    public static void main (String[] args) {
        int[] myArr = new int[]{0,1,2,3,4,5,6,7,8,9};
        int counter = 0;
        while (counter < myArr.length) {
            System.out.println(myArr[counter]);
            counter++;
        }
    }
}

