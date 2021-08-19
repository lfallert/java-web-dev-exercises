package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());   // prints 13

        Cat suki = new HouseCat("Suki", 15);

        HouseCat millie = new HouseCat("Millie", 15);
        System.out.println(millie);

        // Calls HouseCat's noise() method
        suki.noise(); // Hello, my name is Suki!

        // Results in a compiler error, since Cat
        // doesn't have such a method
        //suki.isSatisfied();

        // As long as suki really is a HouseCat, this works
        ((HouseCat) suki).isSatisfied();
    }
}
