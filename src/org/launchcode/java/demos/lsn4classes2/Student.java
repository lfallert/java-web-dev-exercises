package org.launchcode.java.demos.lsn4classes2;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits <= 29) {
            return "Freshmen";
        } else if (this.numberOfCredits <= 59) {
            return "Sophomore";
        } else if (this.numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }

    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString() {
        return "Name: " + this.name + "  Student ID: " + this.studentId + "  Grade: " + this.getGradeLevel() + "  Number of Credits: "
                + this.numberOfCredits + "  GPA: " + this.gpa;
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Object toBeCompared) {
        //checks if object is the same as the other object
        if(this == toBeCompared){
            return true;
        }
        // checks if second object is empty or missing values?
        if(toBeCompared == null){
            return false;
        }
        // checks if the objects are of the small class
        if(this.getClass() != toBeCompared.getClass()) {
            return false;
        }
        // cast the object toBeCompared to the student class so we can access toBeCompared as a student object
        Student newStudent = (Student) toBeCompared;
        if(this.studentId == newStudent.getStudentId()) {
            return true;
        } else {
            return false;
        }

    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);

        Teacher prof = new Teacher("Paul", "Mason", "Math", 4);
        System.out.println(prof.getFirstName());
    }
}
