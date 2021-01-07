package com.ms.learning.designpatterns.composite;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:29
 * @version: v1.0
 */
public class Tree {

    private TreeNode root;

    public Tree() {

    }

    public Tree(String treeName) {
        root = new TreeNode(treeName);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
