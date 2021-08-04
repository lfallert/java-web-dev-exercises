package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;
import java.util.List;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
       Student laura = new Student("Laura", 813, 1, 4.0);
       Student berry = new Student("Berry", 515, 2, 3.5);
       Student millie = new Student("Millie", 234, 1, 3.0);
       ArrayList<Student> javaStudents = new ArrayList<>(List.of(laura, berry, millie));

       Teacher mrMann = new Teacher("Paul", "Mann", "Java", 5);

       Course java = new Course(mrMann, "java101", javaStudents);

       System.out.println(java.getStudents());
       System.out.println((java.getTeacher()));

       System.out.println(java.toString());

    }

}


