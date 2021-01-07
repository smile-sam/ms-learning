package com.ms.learning.designpatterns.proxy.jdk;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/7 10:25
 * @version: v1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void addUser(String username) {
        System.out.println("新增用户: " + username);
    }
}
