package com.qalabs.javabasics;

class Counter {
    public static int classVariable = 0;
    private int instanceVariable;

    public Counter() {
        Counter.classVariable += 1;
        this.instanceVariable = 0;
    }
    public int add(int num) {
        this.instanceVariable += num;
        return this.instanceVariable;
    }
}

public class ClassVariableExample {
    public static void main (String[] args) {
        Counter counter1 = new Counter();
        System.out.println("Counter 1: " + counter1.add(10));
        System.out.println("Instances Created:" + Counter.classVariable);
        Counter counter2 = new Counter();
        System.out.println("Counter 2: " + counter2.add(20));
        System.out.println("Instances Created: " + Counter.classVariable);
    }
}

