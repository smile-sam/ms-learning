package com.ms.learning.designpatterns.prototype.clone;


import java.io.*;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 10:48
 * @version: v1.0
 */
public class User implements Cloneable, Serializable {

    private String username;

    private int age;

    public User() {
        for (int i = 0; i < 1000; i++)
            username += "a";
    }

    public User(String username, int age) {
        for (int i = 0; i < 1000; i++)
            username += "a";
        this.username = username;
        this.age = age;
    }


    // private UserRole userRole;


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

    // public UserRole getUserRole() {
    //     return userRole;
    // }
    //
    // public void setUserRole(UserRole userRole) {
    //     this.userRole = userRole;
    // }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        User user = (User) object;
        // user.userRole = (UserRole) userRole.clone();
        return user;
    }


    public Object deepClone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;

        ObjectInputStream ois = null;

        try {

            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            User user = (User) ois.readObject();
            return user;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }

        }

    }


}
