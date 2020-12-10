package com.ms.learning.designpatterns.proxy;

/**
 * @description: TODO
 * @author: sam
 * @date: 2020/12/7 11:00
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) throws Exception {

        // JDK
        JdkProxy jdkProxy = new JdkProxy();//实例化JDKProxy对象
        UserManager user = (UserManager) jdkProxy.getJDKProxy(new UserManagerImpl());//获取代理对象
        user.addUser("admin", "123123");//执行新增方法

        System.out.println("======================================================================");
        // cglib
        CglibProxy cglib = new CglibProxy();//实例化CglibProxy对象
        UserManager user2 =  (UserManager) cglib.getCglibProxy(new UserManagerImpl());//获取代理对象
        user2.delUser("admin2");//执行删除方法

    }
}
