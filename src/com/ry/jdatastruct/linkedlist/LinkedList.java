package com.ry.jdatastruct.linkedlist;

import java.util.NoSuchElementException;
import java.util.concurrent.ForkJoinPool;

public class LinkedList {

    private class Node {
        private int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addFist(int item){
        Node node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }else {
            node.next = first;
            first = node;
        }
        size++;
    }
    public void addLast(int item){
        Node node = new Node(item);
        if (isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
        size++;
    }
    public void removeFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
        }else {
            //order remove '->' of '1 -> 2'
            //can't first = first.next
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    public void removeLast(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        size--;
    }
    private Node getPrevious(Node node){
        var current = first;
        while (current != null){
            if (current.next == node){
                return current;
            }
            current = current.next;
        }
        return null;
    }
    public boolean contains(int item){
        return indexOf(item) != -1;
    }
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }
    public int[] toArray(){
        var current = first;
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = current.value;
            current = current.next;
        }
        //other way
//        int index = 0;
//        while (current != null) {
//            array[index] = current.value;
//            current = current.next;
//        }

        return array;
    }
    public void reverse(){
        var previous = first;
        var current = first.next;

        while (current != null){
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        last = first;
        last.next = null;
        first = previous;
    }
    public int getKthFromTheEnd(int k){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++){
            b = b.next;
            if ( b == null){
                throw new IllegalArgumentException();
            }
        }
        while (b != last){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
    public int size(){
        return size;
    }
    private boolean isEmpty(){
        return first == null;
    }
}
