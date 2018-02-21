package com.junkamimura;

//A subclass inherits (extends) from a parent class
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //super calls the constructor for the class that are extending from
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() is called");
    }
//without this overriding method, the parent class Animal.eat() will only be called
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() is called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() is called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() is called");
        super.move(speed);
    }

}
