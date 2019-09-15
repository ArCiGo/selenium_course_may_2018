package com.qalabs.javabasics;


class Bike
{
    private String brand;
    public int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 5;
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
class roadBike extends Bike
{
    public roadBike(String brand){
        super(brand);
        this.setSpeed(10);
    }
    void getBikespeed(){
        this.setSpeed(getSpeed()+ 10);
    }
}


public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike outside solve");
        System.out.println(bike.getBrand());
        solve(bike);
        System.out.println(bike.getBrand());
        roadBike rb =new roadBike("armando");
        rb.speedUp();
        assert  rb.getSpeed()==100:"no es igual";
    }

    public static void solve(Bike bike) {
        bike.setBrand("Bike inside solve");
    }
}
