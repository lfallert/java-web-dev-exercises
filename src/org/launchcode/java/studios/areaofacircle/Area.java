package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        String radius = input.nextLine();
        if(radius.equals("")) {
            System.out.println("Invalid Entry");
        } else {
            double convertedRadius = Double.parseDouble(radius);
            if (convertedRadius < 0) {
                System.out.println("Invalid entry.");
            } else {
                double area = Circle.getArea(convertedRadius);
                System.out.println(area);
                input.close();
            }
        }
    }


}
