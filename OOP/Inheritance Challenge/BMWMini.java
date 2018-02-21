package com.junkamimura;

public class BMWMini extends Car{
    private String carOrigin;
    private int year;
    private int warrantyMonths;

    public BMWMini(int warrantyMonths) {
        super("Mini cooper", "2D", 4,2, 4, false, 1);
        this.carOrigin = "Germany";
        this.year = 1915;
        this.warrantyMonths = warrantyMonths;
    }

    public void accelerate(int race){
        int newVelocity = getCurrentVelocity() + race;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        }
        else if (newVelocity <= 10) {
            changeGear(1);
        }
        else if (newVelocity <= 20){
            changeGear(2);
        }
        else if (newVelocity <= 30){
            changeGear(3);
        }
        else {
            changeGear(4);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

