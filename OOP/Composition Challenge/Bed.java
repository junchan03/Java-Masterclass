package com.junkamimura;

public class Bed {
    private String size;
    boolean bedStorage;
    private int nightstands;
    private int pillows;
    private String textiles; //Nattjasmin

    public Bed(String size, boolean bedStorage, int nightstands, int pillows, String textiles) {
        this.size = size;
        this.bedStorage = bedStorage;
        this.nightstands = nightstands;
        this.pillows = pillows;
        this.textiles = textiles;
    }

    public void make(){
        System.out.println("Making bed!");
    }

    public String getSize() {
        return size;
    }

    public boolean isBedStorage() {
        return bedStorage;
    }

    public int getNightstands() {
        return nightstands;
    }

    public int getPillows() {
        return pillows;
    }

    public String getTextiles() {
        return textiles;
    }
}
