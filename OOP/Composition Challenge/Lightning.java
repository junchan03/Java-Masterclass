package com.junkamimura;

public class Lightning {
    private int numberOfLightning;
    private int lux;
    boolean ceilinglight;
    boolean tablelamp;
    boolean nightstand;

    public Lightning(int numberOfLightning, int lux, boolean ceilinglight, boolean tablelamp, boolean nightstand) {
        this.numberOfLightning = numberOfLightning;
        this.lux = lux;
        this.ceilinglight = ceilinglight;
        this.tablelamp = tablelamp;
        this.nightstand = nightstand;
    }

    public void turnon(){
        System.out.println("The light is turned on");
    }

    public void changelux(int lux){
        this.lux = lux;
        System.out.println("The lux level has been changed to " + lux);
    }

    public int getNumberOfLightning() {
        return numberOfLightning;
    }

    public int getLux() {
        return lux;
    }

    public boolean isCeilinglight() {
        return ceilinglight;
    }

    public boolean isTablelamp() {
        return tablelamp;
    }

    public boolean isNightstand() {
        return nightstand;
    }

}
