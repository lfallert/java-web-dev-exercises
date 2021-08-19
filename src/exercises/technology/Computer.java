package exercises.technology;

import java.util.UUID;

public class Computer extends AbstractEntity {

    private int year;
    private String brand;
    private String color;

    //constructors
    public Computer(int year, String brand, String color) {
        this.year = year;
        this.brand = brand;
        this.color = color;
    }

    //no args constructor
    public Computer() {
        year = 2019;
        brand = "Sony";
        color = "midnight black";
    }


    //getters
    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    //setters
    public void setYear(int year) {
        this.year = year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //methods
    public String printBrand() {
        return "This device is a " + brand;
    }
    public String printYear() {
        return "This device came out in " + year;
    }


}
