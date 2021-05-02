package com.ertas;

public class Student extends User{
   private String enrolledCourses;

    public Student(int id, String firstname, String lastName, String email, String enrolledCourses) {
        super(id, firstname, lastName, email);
        this.enrolledCourses = enrolledCourses;
    }

    public String getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
}
