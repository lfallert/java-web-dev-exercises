package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class MenuItem {


    //fields
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;



    //constructor
    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


    //getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public  double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public boolean getIsNew() { return isNew; }
    public void setNew(boolean isNew) { this.isNew = isNew; }



    //ToString method
    public String toString() {
        return "*****\n" + "Name: " + this.name.toUpperCase() + "\n" + this.description.toUpperCase() + "\n" + "Price: " + this.price + "\n*****";
    }

    //Equals Method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return this.name.equals(((MenuItem) o).getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category, isNew);
    }


}

