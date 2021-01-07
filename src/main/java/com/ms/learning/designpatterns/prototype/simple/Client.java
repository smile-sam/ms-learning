package com.ms.learning.designpatterns.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 10:50
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>(10000000);
        User user = null;
        for (int i = 0; i < 10000000; i++) {
            user = new User("name" + i, i + 1, new UserRole(i,"role"+i,"permission"+i));
            userList.add(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("cost " + (endTime - startTime) + "  ms");
    }
}
