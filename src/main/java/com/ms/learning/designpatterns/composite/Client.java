package com.ms.learning.designpatterns.composite;

import com.google.gson.Gson;

import java.awt.*;
import java.util.TreeMap;

/**
 * 组合模式
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:18
 * @version: v1.0
 */
public class Client {

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode treeNodB = new TreeNode("B");
        TreeNode treeNodeC = new TreeNode("C");
        treeNodB.addChild(treeNodeC);
        tree.getRoot().addChild(treeNodB);
        System.out.println(new Gson().toJson(tree));


    }
}
