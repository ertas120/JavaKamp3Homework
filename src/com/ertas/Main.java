package com.ertas;

public class Main {

    public static void main(String[] args) {
        User student = new Student(1, "Ali", "Nea", "aed@gmial.com", "awd");
        User instructor = new Instructor(1, "Engin", "Demirog", "engindemirog@gmail.com", 129072312312312L, "Ben Engin Demirog...");

        UserManager userManager = new UserManager();
        userManager.signUp(student);
        userManager.signIn(student);

    }
}
