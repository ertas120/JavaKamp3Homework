package com.ertas;

public class UserManager {
    public void signUp(User user) {
        System.out.println("Kayt oldundu: " + user.getFirstname());
    }

    public void signIn(User user) {
        System.out.println("Giriş Yapıldı: " + user.getFirstname());
    }
}
