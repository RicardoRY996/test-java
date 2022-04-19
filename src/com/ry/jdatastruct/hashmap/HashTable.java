package com.ry.jdatastruct.hashmap;

import java.nio.file.attribute.AclEntryType;
import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] entries = new LinkedList[5];



    /*
    介绍：
    put(key, value)
    根据key用hash（）方法获得index
    entries是一条数组链表，
    index是链表的[索引]，
    每个索引中的值都相当于一个Entry结点
    每个节点有（key， value）。

    entries[index]
     |[index]| -> entry(key, value) -> entry(key, value)
     |[]| ->
     |[]| ->
     |[]| ->
     */
    public void put(int key, String value){
        var entry = getEntry(key);
        if (entry != null){
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
    }

    public String get(int key){
        var entry = getEntry(key);
        if (entry == null){
            return null;
        }
        return entry.value;
        //return (entry == null) ? null : entry.value
    }
    public void remove(int key){
        var entry = getEntry(key);
        if (entry == null){
            throw new IllegalStateException();
        }
        getBucket(key).remove(entry);

    }

    private LinkedList<Entry> getBucket(int key){
        return entries[hash(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null){
            entries[index] = new LinkedList<>();
        }
        return bucket;
    }

    private Entry getEntry(int key){
        var bucket = getBucket(key);
        if (bucket != null){
            for (var entry : bucket){
                if (entry.key == key){
                    return entry;
                }
            }
        }
        return null;
    }

    private int hash(int key){
        return key % entries.length;
    }
}
