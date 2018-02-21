package com.junkamimura;

public class BasicBurger extends Humburger {

    public BasicBurger(String breadType, String meat) {
        super("Regular Burger", breadType, meat, 4);

        System.out.println("Your order is Regular Burger!");
        System.out.println("Your bread choice is " + breadType);
        System.out.println("Your meat choice is " + meat);
    }
}

