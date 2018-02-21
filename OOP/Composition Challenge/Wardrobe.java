package com.junkamimura;

public class Wardrobe {
    private int width;
    private int height;
    private int depth;
    private String color;

    public Wardrobe(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
    }

    public void moveWardrobe(String location){
        System.out.println("The wardrobe is moved to " + location);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public String getColor() {
        return color;
    }
}
