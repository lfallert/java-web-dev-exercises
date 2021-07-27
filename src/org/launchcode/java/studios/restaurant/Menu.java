package org.launchcode.java.studios.restaurant;

import java.util.Date;

public class Menu {

    //fields
    private MenuItem menuItem;

    //constructor
    public Menu(Object menuItem) {
        this.menuItem = (MenuItem) menuItem;
    }

    //getter and setter
    public MenuItem getMenuItem() { return menuItem; }
    public void setMenuItem(MenuItem menuItem) { this.menuItem = menuItem; }

    //methods
    public void lastUpdated() {
        Date lastUpdated = MenuItem.getDate();
        System.out.println("This menu was last updated on " + lastUpdated);
    }

}
