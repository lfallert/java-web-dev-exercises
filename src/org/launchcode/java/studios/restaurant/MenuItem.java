package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class MenuItem {

    //fields
    private float price;
    private String description;
    private ArrayList<String> category = new ArrayList<>( Arrays.asList("appetizer", "main course", "dessert") );

    //constructor
    public MenuItem(float price, String description, ArrayList<String> category) {
        this.price = price;
        this.description = description;
        this.category = category;
    }

    //getters and setters
    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public ArrayList<String> getCategory() { return category; }
    public void setCategory(ArrayList<String> category) { this.category = category; }

    //methods
    public static boolean isNewItem() {
        LocalDate currentDate = LocalDate.now();
        LocalDate currentDateMinus3Months = currentDate.minusMonths(3);
        if (currentDate.isAfter(currentDateMinus3Months)) {
            return true;
        } else {
            return false;
        }
    }

    public static Date getDate() {
        Date lastUpdated = new Date();
        return lastUpdated;
    }


}

