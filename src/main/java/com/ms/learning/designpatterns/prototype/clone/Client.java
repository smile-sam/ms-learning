package com.ms.learning.designpatterns.prototype.clone;


import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.ms.learning.utils.KryoUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/5 10:50
 * @version: v1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        testKryo();
    }

    // cost 15954  ms
    public static void testDeepCloneBySerializable() throws CloneNotSupportedException {
        System.out.println("================ testDeepCloneBySerializable ==========================");
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>(10000000);
        User user = new User("name", 1);
        UserRole userRole = new UserRole();
        for (int i = 0; i < 100000; i++) {
            user = (User) user.clone();//.deepClone();
            user.setUsername("name" + i);
            user.setAge(i + 1);
            // userRole = (UserRole)userRole.clone();
            // userRole.setId(i);
            // userRole.setName("role"+i);
            // userRole.setPermission("permission"+i);
            // user.setUserRole(userRole);
            // user =  new User("name" + i, i + 1, new UserRole(i,"role"+i,"permission"+i));
            userList.add(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("cost " + (endTime - startTime) + "  ms");
        System.out.println("================ testDeepCloneBySerializable ==========================");
    }

    public static void testSimple() {
        System.out.println("================ testSimple ==========================");
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>(10000000);
        User user = null;
        UserRole userRole = new UserRole();
        for (int i = 0; i < 100000; i++) {
            // user = new User("name",1,new UserRole(1,"role","permission"));
            user = new User("name", 1);
            userList.add(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("cost " + (endTime - startTime) + "  ms");
        System.out.println("================ testSimple ==========================");

    }

    public static void testKryo() {
        System.out.println("================ testKryo ==========================");
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>(10000000);
        // User user =  new User("name",1, new UserRole(1,"role","permission"));
        User user = new User("name", 1);
        byte[] tempByteArray = KryoUtil.writeToByteArray(user);

        for (int i = 0; i < 100000; i++) {
            user = KryoUtil.readFromByteArray(tempByteArray);

            user.setUsername("name" + i);
            user.setAge(i + 1);
            userList.add(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("cost " + (endTime - startTime) + "  ms");
        System.out.println("================ testKryo ==========================");

    }

    public static void testKryo2() throws FileNotFoundException {
        System.out.println("================ testKryo ==========================");
        long startTime = System.currentTimeMillis();
        List<User> userList = new ArrayList<>(10000000);
        Kryo kryo = new Kryo();
        kryo.register(User.class);
        kryo.register(UserRole.class);
        User user = new User("name", 1);
        Output output = new Output(new FileOutputStream("file.bin"));
        kryo.writeObject(output, user);
        output.close();
        // Input input = new Input(new FileInputStream("file.bin"));
        // User user =  new User("name",1, new UserRole(1,"role","permission"));
        // byte[] tempByteArray = KryoUtil.writeObjectToByteArray(user);
        // user = kryo.readObject(input, User.class);
        // input.close();

        Input input = new Input(new FileInputStream("file.bin"));
        // user = kryo.readObject(input, User.class);
        // input.close();
        for (int i = 0; i < 4; i++) {
            //user = KryoUtil.readFromByteArray(tempByteArray);
            // user.setUsername("name" + i);
            // user.setAge(i + 1);
            // input = new Input (new FileInputStream("file.bin"));
            user = kryo.readObject(input, User.class);
            input.reset();
            user.setUsername("name" + i);
            System.out.println("hascode = " + user.hashCode());
            userList.add(user);
        }
        //System.out.println("userList \t" + new Gson().toJson(userList));
        input.close();
        long endTime = System.currentTimeMillis();
        System.out.println("cost " + (endTime - startTime) + "  ms");
        System.out.println("================ testKryo ==========================");

    }


    /**
     * 本题的考点是：三目运算符的类型转换问题。
     * <p>
     * boolean ? 表达式1:表达式2 ;
     * <p>
     * 对于三目运算符，当“表达式1”和“表达式2”的类型不一致时，有以下几个原则。
     * <p>
     * 三目运算符中，如果"表达式1"和"表达式2"的类型不一致，则运算符结果的类型就是提升后的类型（即进行自动类型转换后的结果）。对应本题中的n1 == n2 ? 100.0 : 200
     * <p>
     * 对于“整数问题”，这里的整数是指“short,byte,char,int”。如果"表达式1"是short/byte/char，"表达式2是int，则分为以下两种情况：
     * <p>
     * 表达式2是int常量：
     * <p>
     * 如果"表达式2"在表达式1（short,byte,char）的数据范围以内，能够转为表达式1的类型，则转为表达式1的类型；对应本题中的n1 == n2 ? 'A' : 66
     * <p>
     * 如果"表达式2"不在表达式1（short,byte,char）的数据范围以内，则保持不变。对应本题中的n1 == n2 ? 'A' : 66666
     * <p>
     * 表达式2是int变量
     * <p>
     * 统一进行自动类型提升，对应本题的n1 == n2 ? 'A' : n2和n1 != n2 ? 'A' : n2
     * <p>
     * <p>
     * <p>
     * <p>
     * "表达式1"和"表达式2"中一个是基本类型，另一个是对象类型，则统一转为基本类型，对应本题的map == null ? 0 : map.get("")，其中“表达式1”是基本类型,“表达式2”是引用类型。因此最终结果为基本类型(int)，即把map.get("")转为基本类型，但map.get("")的值是null，null转int时会报空指针异常。
     */
    public static void test() {
        int n1 = 1, n2 = 2;

        System.out.println(n1 == n2 ? 100.0 : 200);
        System.out.println(n1 == n2 ? 'A' : 66);
        System.out.println(n1 == n2 ? 'A' : 66666);

        System.out.println(n1 == n2 ? 'A' : n2);
        System.out.println(n1 != n2 ? 'A' : n2);

        Map<String, Integer> map = new HashMap<>();
        System.out.println(map == null ? 0 : map.get(""));
    }


}
