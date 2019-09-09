package com.qalabs.javabasics;

interface Vehicle {
    void printSpeed();
    void speedUp();
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

    public int getSpeed(){return this.speed;}

    public void printSpeed() { int speed = this.speed; }
}

class Truck implements Vehicle {
    private int speed;

    Truck() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed)); }
    public int getSpeed(){return this.speed;}

    public void printSpeed() { int speed = this.speed;}
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle.printSpeed();
        System.out.println("The speed Tank is: " + myVehicle.getSpeed());
        assert myVehicle.getSpeed() == 1;
        assert myVehicle.getSpeed() > 1 : "Speed of tank is 1";

        myVehicle = new Truck();
        myVehicle.speedUp();
        myVehicle.printSpeed();
        System.out.println("The speed Truck is: " + myVehicle.getSpeed());
        assert myVehicle.getSpeed() == 5;
        assert myVehicle.getSpeed() > 5 : "Is speed of truck is 5";
    }
}
