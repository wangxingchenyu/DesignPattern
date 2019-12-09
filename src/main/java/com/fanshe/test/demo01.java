package com.fanshe.test;

public class demo01 {
    private String username;
    private int age;
    private String email;

    /**
     * 无参构造
     */
    public demo01() {
        System.out.println("调用了无参构造");
    }

    /**
     * 有参构造
     *
     * @param username
     * @param age
     * @param email
     */
    public demo01(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
        System.out.println("have parames");
    }

    public static void main(String[] args) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
}
