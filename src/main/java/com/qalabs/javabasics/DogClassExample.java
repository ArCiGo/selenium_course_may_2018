package com.qalabs.javabasics;
<<<<<<< HEAD

 class Dog {
=======
class Dog {
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

<<<<<<< HEAD
    public int getHumanAge(){
        return this.age *7;
    }

=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

<<<<<<< HEAD

    public String toString() {
        return String.format("My name is %s. I am %d years old, equivalent to %d human years.", this.getName(),this.getAge(),this.getHumanAge());
    }
}

public class DogClassExample {

    public static void main (String[] args) {
        String name = "Solovino";
        int age = 7;
        int  yearsHuman = 28;
        Dog myDog = new Dog(name, age);

        System.out.println(myDog.toString());

        assert myDog.getName() != name: "El perro se llama como se esperaba";
        assert myDog.getAge() > age: "la edad esta bien";
        assert myDog.getHumanAge() == yearsHuman: "La edad de humano corresponde a: ";
        assert yearsHuman == 0: "La edad del perro en años humanos no es 0";
    }
=======
   public int getHumanYears() { return this.age*7;}

    public String toString() {
        return String.format("%s has %d years", this.name, this.age);
    }

}



public class DogClassExample {

    public static void main (String[] args) {
        Dog myDog = new Dog("MyDog", 4);
       System.out.println(myDog.toString());
       int age1 = myDog.getAge()*7;
       System.out.println(myDog.getHumanYears());
       assert myDog.getHumanYears() == age1;
       assert myDog.getHumanYears() != age1: "Dog age in human years is correct";

    }

>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
}
