package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    //fields
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //getter and setter
    public static ArrayList<MenuItem> getMenuItem() { return menuItems; }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    //methods
    public static ArrayList<MenuItem> printAllMenuItems() {
        return menuItems;
    }

    public static MenuItem printMenuItem(MenuItem itemToBePrinted) {
        return itemToBePrinted;
    }

    public static void addMenuItem(MenuItem itemToBeAdded) {
        menuItems.add(itemToBeAdded);
    }

    public static void removeMenuItem(MenuItem itemToBeRemoved) {
        menuItems.remove(itemToBeRemoved);
    }

//    public static MenuItem lastUpdated(MenuItem itemToBeDated) {
//        return itemToBeDated.dateCreated;
//    }



}

