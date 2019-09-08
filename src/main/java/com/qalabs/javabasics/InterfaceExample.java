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

    public int getSpeed() {
        return this.speed;
    }

    public void printSpec() {
        System.out.println("Soy un tanque");
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
        System.out.println("Soy una camioneta");
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        int tankVel = myVehicle.getSpeed();
        myVehicle.printSpec();

        myVehicle = new Truck();
        myVehicle.speedUp();
        int truckVel = myVehicle.getSpeed();
        myVehicle.printSpec();

        assert truckVel == tankVel : "Algo debe salir mal";
    }
}
