package com.junkamimura;

public class Main {
    // Create a single room of a house using composition.
    // Think about the things that should be included in the room.
    // Maybe physical parts of the house but furniture as well
    // Add at least one method to access an object via a getter and
    // then that objects public method as you saw in the previous video
    // then add at least one method to hide the object e.g. not using a getter
    // but to access the object used in composition within the main class
    // like you saw in this video.
    public static void main(String[] args) {

        Bed bed = new Bed("Queen", false, 2, 2, "Nattjasmin");
        Wardrobe wardrobe = new Wardrobe(100, 300, 80, "white");
        Table table = new Table(200, 80, 90, "White");
        Chair chair = new Chair(30, 30, "White");
        Drawer drawer = new Drawer(90, 50, 90, 2);
        Bookshelf bookshelf = new Bookshelf(120, 20, 300, 7);
        Lightning lightning = new Lightning(4, 50, true, true, true);

        Room myRoom = new Room(bed, wardrobe, table, chair, drawer, bookshelf, lightning);

        myRoom.lightup(100);
        myRoom.getBed().make();

    }

}


