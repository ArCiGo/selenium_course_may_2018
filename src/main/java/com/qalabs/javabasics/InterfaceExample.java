package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
}

class Tank implements Vehicle {
    private int speed;
    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }
}

class Truck implements Vehicle {
    private int speed;
    private int  printSpec;

    Truck() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed));

    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle = new Truck();
        myVehicle.speedUp();
    }
}
