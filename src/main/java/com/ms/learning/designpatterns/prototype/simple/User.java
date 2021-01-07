package com.ms.learning.designpatterns.prototype.simple;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 10:48
 * @version: v1.0
 */
public class User {

    private String username;

    private int age;

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public User(String username, int age, UserRole userRole) {
        this.username = username;
        this.age = age;
        this.userRole = userRole;
    }

    private UserRole userRole;


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

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
