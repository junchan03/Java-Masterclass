package com.junkamimura;

public class Humburger {
    private String name;
    private String BreadType;
    private String meat;
    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean onions;
    private boolean avocado;
    private boolean mushrooms;
    private boolean pickles;
    private int maxToppings;
    public double price;

    public Humburger(String name, String breadType, String meat, int maxToppings) {
        this.name = name;
        this.BreadType = breadType;
        this.meat = meat;
        this.maxToppings = maxToppings;
        this.price = 6.0;
    }

     public void chooseIngredients(boolean cheese, boolean lettuce, boolean tomato, boolean onions, boolean avocado, boolean mushrooms, boolean pickles) {
        int numberOfToppings;
        numberOfToppings = 0;
        if (numberOfToppings < maxToppings) {
            if (cheese == true) {
                numberOfToppings +=  1;
                this.price = this.price + 1;
                System.out.println("Cheese added at $1");
            }
        }
        if (numberOfToppings < maxToppings) {
            if (lettuce == true) {
                numberOfToppings +=  1;
                this.price = this.price + 0.5;
                System.out.println("Lettuce added at $0.50");
            }
        }
        if (numberOfToppings < maxToppings) {
            if (tomato == true) {
                numberOfToppings += 1;
                this.price = this.price + 0.5;
                System.out.println("Tomato added at $0.50");
            }
        }
         if (numberOfToppings < maxToppings) {
            if (onions == true) {
                 numberOfToppings +=  1;
                 this.price = this.price + 0.5;
                 System.out.println("Onions added at $0.50");
             }
         }
        if (numberOfToppings < maxToppings){
            if(avocado == true) {
                numberOfToppings +=  1;
                this.price = this.price + 1;
                System.out.println("Avocado added at $1");
            }
        }
        if (numberOfToppings < maxToppings) {
            if (mushrooms == true) {
                numberOfToppings += 1;
                this.price = this.price + 0.5;
                System.out.println("Mushrooms added at $0.50");
            }
        }
        if (numberOfToppings < maxToppings) {
            if (pickles == true) {
                numberOfToppings += 1;
                this.price = this.price + 0.5;
                System.out.println("Pickles added at $0.50");
            }
        }
        System.out.println("The total number of additional items selected were " + numberOfToppings);
        System.out.println("The total price is $" + price);
    }
}
