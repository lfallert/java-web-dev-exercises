package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    //fields
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructor
    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //constructor that sets default values if not specified, i think
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    //setters and getters
    public void setName(String name) {
        name = this.name;
    }

    public void setStudentId(int studentId) {
        studentId = this.studentId;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        numberOfCredits = this.numberOfCredits;
    }

    public void setGpa(double gpa) { this.gpa = gpa; }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() { return gpa; }

}