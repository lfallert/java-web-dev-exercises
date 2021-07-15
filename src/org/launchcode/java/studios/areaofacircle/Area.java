package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        Double radius = input.nextDouble();

        System.out.println("The area of a circle with a " + radius + " radius is " + Circle.getArea(radius));
        input.close();
    }

        
}
