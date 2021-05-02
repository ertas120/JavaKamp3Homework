package com.ertas;

public class Instructor extends User {
    private Long salary;
    private  String aboutMe;

    public Instructor(int id, String firstname, String lastName, String email, Long salary, String aboutMe) {
        super(id, firstname, lastName, email);
        this.salary = salary;
        this.aboutMe = aboutMe;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

}
