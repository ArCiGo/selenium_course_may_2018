package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec();
    int getSpeed();
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

    public void printSpec() {
        System.out.println("This is a Tank");
    }

    public int getSpeed() {
        return this.speed;
    }
}

class Truck implements Vehicle {
    private int speed;

    Truck() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed));
    }

    public int getSpeed() {
        return this.speed;
    }

    public void printSpec() {
        System.out.println("This is a Truck");
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.printSpec();
        myVehicle.speedUp();
        assert myVehicle.getSpeed() == 1 : "La velocidad debe ser 1";
        //assert myVehicle.getSpeed() == 2 : "La velocidad debe ser 2";
        myVehicle = new Truck();
        myVehicle.printSpec();
        myVehicle.speedUp();
        assert myVehicle.getSpeed() == 5 : "La velocidad debe ser 5";
        assert myVehicle.getSpeed() == 4 : "La velocidad debe ser 4";
    }
}
