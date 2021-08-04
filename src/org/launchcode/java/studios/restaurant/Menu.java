package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    //fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //constructor
//    public Menu(Object menuItem) {
//        this.menuItem = (MenuItem) menuItem;
//    }

    //getter and setter
    public ArrayList<MenuItem> getMenuItem() { return menuItems; }

//    //methods
//    public void lastUpdated() {
//        Date lastUpdated = MenuItem.getDate();
//        System.out.println("This menu was last updated on " + lastUpdated);
//    }

}
