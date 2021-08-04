package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MenuItem {

    //fields
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    //constructor
    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    //getters and setters
    public  double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean getIsNew() { return isNew; }
    public void setNew(boolean isNew) {this.isNew = isNew; }

    //methods
//    public static boolean isNewItem() {
//        LocalDate currentDate = LocalDate.now();
//        LocalDate currentDateMinus3Months = currentDate.minusMonths(3);
//        if (currentDate.isAfter(currentDateMinus3Months)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static Date getDate() {
//        Date lastUpdated = new Date();
//        return lastUpdated;
//    }


}

