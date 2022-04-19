package com.ry.jdatastruct.tree;

public class Tree {
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
        public String toString(){
            return "Node = " + value;
        }
    }
    private Node root;

    /*
                  [value]
    [leftNode]value           [rightNode]value

     */
    //myWay
    public void insert(int value){
        var node = new Node(value);
        if (isEmpty()){
            root = node;
            return;
        }else {
            var current = root;
            while (current != null){
                if (value < current.value){
                    if (current.leftChild == null){
                        current.leftChild = node;
                        break;
                    }
                    current = current.leftChild;
                }else if (value > current.value) {
                    if (current.rightChild == null){
                        current.rightChild = node;
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
    }
    public boolean find(int value){
        var current = root;
        while (current != null){
            if (value < current.value){
                current = current.leftChild;
            }else if (value > current.value){
                current = current.rightChild;
            }else {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return root == null;
    }
}
