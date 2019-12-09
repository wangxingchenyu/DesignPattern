package com.xml;

public class User {
    private String name;
    private String author;
    public static void main(String[] args){
    }

    public User() {
    }

    public User(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
