package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private Teacher teacher;
    private String subject;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(Teacher Teacher, String subject, ArrayList students) {
        this.subject = subject;
        this.teacher = Teacher;
        this.students = students;
    }

    public String toString() {
        return subject + "\n" + teacher.getFirstName() + "\n" + students;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}

