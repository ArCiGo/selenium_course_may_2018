package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return this.brand;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return this.speed;
    }

    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

class RoadBike extends Bike {

    RoadBike(String brand) {
        super(brand);
        this.setSpeed(5);
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }
}


public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike outside solve");
        System.out.println(bike.getBrand());
        solve(bike);
        System.out.println(bike.getBrand());

        //testear speed of de class RoadBike

        bike.speedUp();// bike behaviour

        //override spect behavior for RoadBike

        RoadBike bike1 =  new RoadBike("bike outside solve");
        bike1.speedUp();
        assert bike1.getSpeed() >=6;
        assert bike1.getSpeed() > 6 : "la velocidad incrementa en 6";
    }

    public static void solve(Bike bike) {
        bike.setBrand("Bike inside solve");
    }
}
