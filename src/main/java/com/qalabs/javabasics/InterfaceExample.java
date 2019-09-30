package com.qalabs.javabasics;

interface Vehicle {
    void printSpeed();
<<<<<<< HEAD
    void speedUp();
=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    int getSpeed();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
<<<<<<< HEAD

    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }

    public int getSpeed(){return this.speed;}

    public void printSpeed() { int speed = this.speed; }
=======
    public void printSpeed() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }
    public int getSpeed(){
        return this.speed;
    }

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
}

class Truck implements Vehicle {
    private int speed;

    Truck() {
        this.speed = 0;
    }
<<<<<<< HEAD
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
=======
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

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    }
}
