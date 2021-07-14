package exercises;

import java.util.Scanner;

//use double for calculations

public class MilesPerGallon {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter miles travelled.");
            double milesTravelled = input.nextDouble();
            System.out.println("Enter amount of gas used.");
            double gasGuzzled= input.nextDouble();
            double  milesPerGallon=milesTravelled/gasGuzzled;
            System.out.println("Your miles-per-gallon is " + milesPerGallon + " mPG.");
        }
    }
}
