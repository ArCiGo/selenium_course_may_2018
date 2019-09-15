package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpect();
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
    public void printSpect(){
        System.out.println("soy un carro");
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
    public void printSpect(){
        System.out.println("soy un truck");
    }
}

public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle = new Truck();
        myVehicle.speedUp();
        myVehicle.printSpect();
        assert myVehicle.equals(myVehicle):"algo malio sal";
    }

}
