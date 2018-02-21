package com.junkamimura;

public class Printer {
    private int inkLevel;
    private int pagesPrinted;
    private boolean doubleSided;

    public Printer(int inkLevel, boolean doubleSided) {
        if (inkLevel > -1 && inkLevel <= 100) {
            this.inkLevel = inkLevel;
        }
        else {
            this.inkLevel = -1;
        }
        this.doubleSided = doubleSided;
        this.pagesPrinted = 0;
    }

    public int refillInk(int refillVolume) {
        if(refillVolume > 0 && refillVolume <= 100){
            if (this.inkLevel + refillVolume > 100){
                return -1;
            }
            this.inkLevel = this.inkLevel + refillVolume;
            System.out.println("The ink is filled up to " + this.inkLevel);
            return this.inkLevel;
        }
        else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.doubleSided == true){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("Printing in double sided");
            this.inkLevel = this.inkLevel - pages;
            System.out.println("The remaining ink amount is " + this.inkLevel);
        }
        else{
            this.inkLevel = this.inkLevel - pages;
            System.out.println("Printing in single sided");
            System.out.println("The remaining ink amount is " + this.inkLevel);

        }
        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
