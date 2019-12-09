package com.fanshe.test;

public class User {
    private int age;
    private String email;
    private String username;

    public User() {
    }

    public User(int age, String email, String username) {
        this.age = age;
        this.email = email;
        this.username = username;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
