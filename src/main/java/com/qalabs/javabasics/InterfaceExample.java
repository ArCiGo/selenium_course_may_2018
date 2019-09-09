package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec();
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
        System.out.println("Tank: " + speed);
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
        System.out.println("Truck: " + speed);
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle = new Truck();
        myVehicle.speedUp();

        Tank tank = new Tank();
        Truck truck = new Truck();
        tank.speedUp();
        truck.speedUp();
        tank.printSpec();
        truck.printSpec();


        assert tank.getSpeed() == truck.getSpeed(): "Las velocidades no son iguales";
    }
}
