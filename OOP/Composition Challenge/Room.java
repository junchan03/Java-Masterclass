package com.junkamimura;

public class Room {
    private Bed bed;
    private Wardrobe wardrobe;
    private Table table;
    private Chair chair;
    private Drawer drawer;
    private Bookshelf bookshelf;
    private Lightning lightning;

    public Room(Bed bed, Wardrobe wardrobe, Table table, Chair chair, Drawer drawer, Bookshelf bookshelf, Lightning lightning) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.table = table;
        this.chair = chair;
        this.drawer = drawer;
        this.bookshelf = bookshelf;
        this.lightning = lightning;
    }


    public void lightup(int lux){
        lightning.changelux(lux);
    }

    public void makeBed() {
        bed.make();
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public Bookshelf getBookshelf() {
        return bookshelf;
    }

    public Lightning getLightning() {
        return lightning;
    }
}
