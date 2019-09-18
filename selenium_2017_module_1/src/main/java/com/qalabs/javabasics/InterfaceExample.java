package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();

    void printSpec();
}

class Tank implements Vehicle {
    private int speed;
    private String brand;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }
    public int getSpeed() { return this.speed; }

    public void printSpec() {
        this.brand = "Tank";
        System.out.println(String.format("Specifications %s", this.brand));
    }
}

class Truck implements Vehicle {
    private int speed;
    private String brand;

    Truck() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed));
    }
    public int getSpeed() { return this.speed; }
    public void printSpec() {
        this.brand = "Truck";
        System.out.println(String.format("Specifications %s", this.brand));
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
      //  assert myVehicle.getSpeed();
        myVehicle = new Truck();
        myVehicle.speedUp();

    }
}
