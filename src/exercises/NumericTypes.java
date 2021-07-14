package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the length:");
            double length= input.nextDouble();
            System.out.println("Enter the breadth:");
            double height= input.nextDouble();
            double  area=length * height;
            System.out.println("The area of the rectangle is " + area);
        }
    }
}
