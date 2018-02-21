package com.junkamimura;

class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }


    public String startEngine(){
        return "Car.startEngine()";
    }

    public String accelerate(){
        return "Car.accelerate()";

    }

    public String brake(){
        return "Car.brake()";

    }
}

class BMWMini extends Car {
    public BMWMini(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMWMini.startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMWMini.accelerate()";
    }

    @Override
    public String brake() {
        return "BMWMini.brake()";
    }
}

class Telsa extends Car {
    public Telsa(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }
}

class Toyota extends Car {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ".accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ".brake()";
    }
}

public class Main {
    // We are going to go back to the car analogy.
    // Create a base class called Car
    // It should have a few fields that would be appropriate for a generic car class.
    // engine, cylinders, wheels, etc.
    // Constructor should initialize cylinders (number of) and name, and set wheels to 4
    // and engine to true. Cylinders and names would be passed parameters.
    //
    // Create appropriate getters
    // Create some methods like startEngine, accelerate, and brake
    //
    // show a message for each in the base class
    // Now create 3 sub classes for your favorite vehicles.
    // Override the appropriate methods to demonstrate polymorphism in use.
    // put all classes in the one java file (this one).

    public static void main(String[] args) {
        Car car = new Car("Base car", 2);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMWMini bmwMini = new BMWMini("Mini", 6);
        System.out.println(bmwMini.startEngine());
        System.out.println(bmwMini.accelerate());
        System.out.println(bmwMini.brake());

        Toyota toyota = new Toyota("Toyota", 6);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

    }
}
