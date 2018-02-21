package com.junkamimura;

public class EnhancedPlayer {
    private String name;
    private int lifePoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int lifePoints, String weapon) {
        this.name = name;
        if (lifePoints > 0 && lifePoints <= 100){
            this.lifePoints = lifePoints;
        }
        this.weapon = weapon;
    }

    public void loseLifePoints(int damage) {
        this.lifePoints = this.lifePoints - damage;
        if (this.lifePoints <= 0) {
            System.out.println("Player knocked out");
        }
        //reduce number of lives remaining for the player
    }

    public int getLifePoints(){
        return lifePoints;
    }

}
