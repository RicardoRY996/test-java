package com.ry.jdatastruct.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(12);
        tree.insert(15);
        tree.insert(23);
        var a = tree.find(10);
        var b = tree.find(23);

    }
}
