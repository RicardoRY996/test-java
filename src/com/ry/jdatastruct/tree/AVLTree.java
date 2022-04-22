package com.ry.jdatastruct.tree;

public class AVLTree {
    private class AVLNode{
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;
        private int height;

        public AVLNode(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Value = " + this.value;
        }
    }
    private AVLNode root;

    public void insert(int value){
        root = insertAVLTree(root, value);
    }
    private AVLNode insertAVLTree(AVLNode root, int value) {
        if (root == null) {
            return new AVLNode(value);
        }
        if (value < root.value){
           root.leftChild = insertAVLTree(root.leftChild, value);
        }else {
            root.rightChild = insertAVLTree(root.rightChild, value);
        }

        setHeight(root);

        return balance(root);
    }
    private AVLNode balance(AVLNode root){
        if (isLeftHeavy(root)){
            if (balanceFactor(root.leftChild) < 0){
                root.leftChild = leftRotate(root.leftChild);
            }
            return rightRotate(root);
        }else if(isRightHeavy(root)){
            if (balanceFactor(root.rightChild) > 0){
                root.rightChild = rightRotate(root.rightChild);
            }
            return leftRotate(root);
        }
        return root;
    }
    private int height(AVLNode node){
        return (node == null) ? -1 : node.height;
    }
    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) < -1;
    }
    private int balanceFactor(AVLNode node){
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }


    private AVLNode rightRotate(AVLNode node){
        var newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }
    private AVLNode leftRotate(AVLNode root){
        var newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }
    private void setHeight(AVLNode node){
        node.height = Math.max(
                height(root.leftChild),
                height(root.rightChild) + 1);
    }
}
