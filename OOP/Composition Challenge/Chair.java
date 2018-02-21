package com.junkamimura;

public class Chair {
    private int width;
    private int depth;
    private String color;

    public Chair(int width, int depth, String color) {
        this.width = width;
        this.depth = depth;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }
}
