package exercises.technology;

public class Laptop extends Computer {

    //fields
    private double ram;

    //constructors
    public Laptop(int year, String brand, String color, double ram) {
        super(year, brand, color);
        this.ram = ram;
    }

    public Laptop(double ram) {
        this.ram = ram;
    }

    //do not need getters and setters because the child class inherits them from the parent class

    // methods
    public double addRam(double num) {
        return ram + num;
    }
}
