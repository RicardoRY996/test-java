package com.ry.jdatastruct.tries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.prefs.PreferenceChangeEvent;

public class Trie {
    private class Node{
        private char value;
        private HashMap<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char value){
            this.value = value;
        }

        public boolean hasChild(char ch){
            return children.containsKey(ch);
        }

        public void addChild(char ch){
            children.put(ch, new Node(ch));
        }

        public Node getChild(char ch){
            return children.get(ch);
        }

        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }

        public boolean hasChildren(){
            return !children.isEmpty();
        }

        public void removeChild(char ch){
            children.remove(ch);
        }

        @Override
        public String toString() {
            return "value=" + value;
        }
    }

    private Node root = new Node(' ');

    public void insert(String word){
        var current = root;
        for (char ch : word.toCharArray()){
            if (!current.hasChild(ch)){
                current.addChild(ch);
            }
            current = current.getChild(ch);
        }
        current.isEndOfWord = true;
    }

    public boolean contains(String word){
        if (word == null) {
            return false;
        }
        var current = root;
        for (char ch : word.toCharArray()){
            if (!current.hasChild(ch)){
                return false;
            }
            current = current.getChild(ch);
        }
        return current.isEndOfWord;
    }

    public void remove(String word){
        if (word == null){
            return;
        }
        remove(root, word, 0);
    }

    public void traverse(){
        traverse(root);
    }

    public List<String> findWords(String prefix){
        List<String> words = new ArrayList<>();
        var lastNode = findLastNodeOf(prefix);
        findWords(lastNode, prefix, words);

        return words;
    }

    private void findWords(Node root, String prefix, List<String> word){
        if (root == null){
            return;
        }

        if (root.isEndOfWord){
            word.add(prefix);
        }

        for (var child : root.getChildren()){
            findWords(child, prefix + child.value, word);
        }

    }

    private Node findLastNodeOf(String prefix){
        if (prefix == null){
            return null;
        }

        var current = root;
        for (var ch : prefix.toCharArray()){
            var child = current.getChild(ch);
            if (child == null){
                return null;
            }
            current = child;
        }
        return current;
    }

    private void traverse(Node root){
        //Pre-order: visit the root first

        System.out.println(root.value);
        var a = root.getChildren();
        for (var child : a){
            traverse(child);
        }
    }

    private void remove(Node root, String word, int index){
        if (index == word.length() - 1){
            root.isEndOfWord = false;
            return;
        }

        var ch = word.charAt(index);
        var child = root.getChild(ch);

        if (child == null){
            return;
        }
        remove(child, word, index + 1);
        if (!child.hasChildren() && !child.isEndOfWord){
            root.removeChild(ch);
        }
    }




}
