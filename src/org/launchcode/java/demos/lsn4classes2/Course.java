package org.launchcode.java.demos.lsn4classes2;

import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;


    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString() {
        return "Instructor Name: " + this.instructor.getFirstName() + "  Topic: " + this.topic;
    }
    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Object toBeCompared) {
        Course theCourse = (Course) toBeCompared;
        return theCourse.getTopic() == getTopic();
    }

    public String getTopic() {
        return topic;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}


