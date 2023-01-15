///////////////////////////////////////////////////////////////////////////////
// Main Class File:    Assignment8.java
// File:               Backpack.java
// Quarter:            CSE 8B Winter 2022
// Author:             Yutao Ye y8ye@ucsd.edu
// Instructor's Name:  Greg Miranda
//
//////////////////////////// 80 columns wide //////////////////////////////////

import java.util.ArrayList;

/**
 * This is Backpack class that you can add items which are berries and
 * pokeballs. You can display your backpack with display() method
 *
 * Bugs: None known
 * @author : Yutao Ye
 *
 */

public class Backpack {

    // ArrayList for items (berries, pokeballs)
    private ArrayList<Item> myItems;

    /**
     * Creates a resizable-array ArrayLists of Items
     * 
     */
    public Backpack() {
        myItems = new ArrayList<>();
    }

    /**
     * Adds the item to myItems
     * 
     */
    public void add(Item item) {
        this.myItems.add(item);
    }

    /**
     * Displays the elements in the myItems ArrayList
     * 
     */
    public void display() {
        System.out.println("Items in the backpack:");
        if (this.myItems.size() == 0) {
            System.out.println("None");
            System.out.println();
        }
        else {
            for (Item itemPack : this.myItems) {
                System.out.println(itemPack);
                System.out.println();
            }
        }

    }
}
