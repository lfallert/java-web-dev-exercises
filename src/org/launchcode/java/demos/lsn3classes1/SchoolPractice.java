package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
       Student laura = new Student("Laura", 813, 1, 4.0);
    }

    public class Course {
        private String teacher;
        private String subject;
        private ArrayList<Student> students;
    }

    public class Teacher {
        private String firstName;
        private String lastName;
        private String subject;
        private int yearsTeaching;

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public void setYearsTeaching(int yearsTeaching) {
            this.yearsTeaching = yearsTeaching;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getSubject() {
            return subject;
        }

        public int getYearsTeaching() {
            return yearsTeaching;
        }
    }

}


