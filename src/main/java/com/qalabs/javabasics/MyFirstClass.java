package com.qalabs.javabasics;

class Car{
    private String myName;
    private Integer mySpeed;

    public Car(String name) {
        this.myName = name;
        this.mySpeed = 0;
    }

    public void accelerate() {
        this.mySpeed+=1;
    }

    public void stop() {
        this.mySpeed = 0;
    }

    public String toString() {
        return String.format("%s has a speed of %d", this.myName, this.mySpeed);
    }
}

public class MyFirstClass {
    public static void main (String[] args) {
        Car myCar = new Car("Mustang");
        myCar.accelerate();
        System.out.println(myCar.toString());
        myCar.stop();
        System.out.println(myCar.toString());
    }
}


