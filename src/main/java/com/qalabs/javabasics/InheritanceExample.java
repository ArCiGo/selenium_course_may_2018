package com.qalabs.javabasics;


class Bike {
    private String brand;
    private int speed;

    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }
<<<<<<< HEAD

=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
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
<<<<<<< HEAD

=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    void speedUp() {
        this.speed += 1;
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }
}

<<<<<<< HEAD
class RoadBike extends Bike {

    RoadBike(String brand) {
        super(brand);
        this.setSpeed(5);
    }
=======
// create a new class RoadBike that extends Bike and override speedup behavior

class RoadBike extends Bike {
    int speed=5;

    RoadBike(String brand) {
        super(brand);
        this.speed = speed;
    }

     public void speedUp(){

        this.speed +=1;
         System.out.println("Bike speed "+ this.speed);
    }
    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int speed){ this.speed= speed; }

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
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


<<<<<<< HEAD
=======

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike outside solve");
        System.out.println(bike.getBrand());
        solve(bike);
        System.out.println(bike.getBrand());

<<<<<<< HEAD
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
=======
        // testear speed of the class RoadBike

        bike.speedUp(); // bike behaivor

        // override speedUp behaivor of bike
        RoadBike bike1 = new  RoadBike("bike outside solve");
        bike1.speedUp();
        assert bike1.getSpeed() == 6;
        assert bike1.getSpeed() > 6 : "speedUp is override";

    }

    public static void solve(Bike bike) {

        bike.setBrand("Bike inside solve");
    }


>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
}
