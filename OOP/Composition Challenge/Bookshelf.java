package com.junkamimura;

public class Bookshelf {
    private int width;
    private int depth;
    private int height;
    private int layers;

    public Bookshelf(int width, int depth, int height, int layers) {
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.layers = layers;
    }

    public int getWidth() {
        return width;
    }

    public int getDepth() {
        return depth;
    }

    public int getHeight() {
        return height;
    }

    public int getLayers() {
        return layers;
    }
}
