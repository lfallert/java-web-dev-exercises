package org.launchcode.java.studios.restaurant;

import java.time.LocalDate;

public class Restaurant {

    public static void main(String[] args) {

        MenuItem taco = new MenuItem("taco", 4.50, "a taco", "main course", true);
        MenuItem nachos = new MenuItem("nachos", 6.50, "a plate of nachos", "appetizer", false);


        Menu.addMenuItem(taco);
        Menu.addMenuItem(nachos);

        System.out.println(Menu.printMenuItem(taco));

        System.out.println(Menu.getMenuItem());

        Menu.removeMenuItem(taco);

        System.out.println(Menu.getMenuItem());

        System.out.println(Menu.printAllMenuItems());

    }

}
