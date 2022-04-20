package com.ry.jdatastruct.tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(10);
        tree.insert(12);
        tree.insert(11);
        tree.insert(20);
        tree.insert(9);
//        tree.isBinarySearchTree();
        var a = tree.getNodesAtDistance(0);
        for (var b : a){
            System.out.println(b);
        }
        tree.traverseInOrder();
    }
}
