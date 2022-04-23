package com.ry.jdatastruct.tries;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        trie.insert("cat");
        trie.insert("can");

        trie.traverse();
    }
}
