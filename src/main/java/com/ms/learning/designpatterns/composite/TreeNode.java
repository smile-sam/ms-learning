package com.ms.learning.designpatterns.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @description: TODO
 * @author: sam
 * @date: 2021/1/6 14:25
 * @version: v1.0
 */
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode() {

    }

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(Vector<TreeNode> children) {
        this.children = children;
    }


    public void addChild(TreeNode child) {
        children.add(child);
    }
    public void removeChild(TreeNode child) {
        children.add(child);
    }
    public Enumeration<TreeNode> getChileren() {
        return children.elements();
    }
}
