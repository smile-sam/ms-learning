package com.ms.learning.designpatterns.prototype.clone;

import java.io.Serializable;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 10:49
 * @version: v1.0
 */
public class UserRole implements Cloneable, Serializable {

    private Integer id;
    private String name;
    private String permission;

    public UserRole() {
    }

    public UserRole(Integer id, String name, String permission) {
        this.id = id;
        this.name = name;
        this.permission = permission;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }





}
