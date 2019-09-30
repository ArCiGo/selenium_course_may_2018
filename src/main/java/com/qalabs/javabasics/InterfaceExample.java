package com.qalabs.javabasics;

interface Vehicle {
    void printSpeed();
    int getSpeed();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void printSpeed() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }
    public int getSpeed(){
        return this.speed;
    }
}

class Truck implements Vehicle {
    private int speed;

    Truck() {
        this.speed = 0;
    }
    public void printSpeed() {
        this.speed += 5;
        System.out.println(String.format("Truck New speed %s", this.speed));
    }
    public int getSpeed(){
        return this.speed;
    }


}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.printSpeed();
        System.out.println(myVehicle.getSpeed());
        assert  myVehicle.getSpeed() == 1;
        assert   myVehicle.getSpeed() > 1: "speed of tank is 1";

        myVehicle = new Truck();
        myVehicle.printSpeed();
        System.out.println(myVehicle.getSpeed());
        assert myVehicle.getSpeed() == 5;
        assert myVehicle.getSpeed() != 5: "speed of truck is 5";

    }
}
