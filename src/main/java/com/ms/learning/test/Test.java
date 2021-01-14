package com.ms.learning.test;

import java.util.stream.Stream;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/12 9:48
 * @version: v1.0
 */
public class Test {

    public static void main(String[] args) {
        Stream.of(100, 200, 300, 400, 500)
                .mapToLong(e -> e * 10)
                .filter(e -> e > 2000)
                .forEach(System.out::println);
    }
}
