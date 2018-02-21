package com.junkamimura;

//This is a bad model
public class Player {
    public String name;
    public int lifePoints;
    public String weapon;

    public void loseLifePoints(int damage) {
        this.lifePoints = this.lifePoints - damage;
        if (this.lifePoints <=0 ) {
            System.out.println("Player knocked out");
        }
        //reduce number of lives remaining for the player
    }

    public int healthRemaining() {
        return this.lifePoints;
    }
}
