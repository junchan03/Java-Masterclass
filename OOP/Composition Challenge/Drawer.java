package com.junkamimura;

public class Drawer {
    private int width;
    private int depth;
    private int hight;
    private int numberOfDrawers;

    public Drawer(int width, int depth, int hight, int numberOfDrawers) {
        this.width = width;
        this.depth = depth;
        this.hight = hight;
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHight() {
        return hight;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }
}
