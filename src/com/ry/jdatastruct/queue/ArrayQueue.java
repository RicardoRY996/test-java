package com.ry.jdatastruct.queue;

import java.util.Arrays;

public class ArrayQueue {
    private int rear;
    private int count;
    private int front;
    int[] items;


    public ArrayQueue(int capacity){
        items = new int[capacity];
    }
    public void enqueue(int item){
        if (count == items.length){
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }
    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }
    public void peek(){

    }
    public boolean isEmpty(){
//        return First == 0 && Last == 0;
        return false;
    }
    public boolean isFull(){
//        return First == Last && Last != 0;
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
