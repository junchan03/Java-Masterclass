package com.junkamimura;

public class DeluxBurger extends Humburger {
    private boolean chips;
    private boolean drinks;

    public DeluxBurger(String breadType, String meat) {
        super("Delux Burger", breadType, meat, 0);
        System.out.println("Your order is Delux Burger!");
        System.out.println("Your bread choice is " + breadType);
        System.out.println("Your meat choice is " + meat);
        System.out.println("Crispy bacon and double " + meat + " included");
        this.chips = true;
        this.drinks = true;
        System.out.println("Chips and Drinks included");
        this.price += 8;
    }
}
