package com.ry.jdatastruct.queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        queue.add(40);
//        queue.remove();
//        System.out.println(queue);
//        reverse(queue);
//        System.out.println(queue);
//        ArrayQueue queue = new ArrayQueue(3);
//        queue.enqueue(10);
//        queue.enqueue(120);
//        queue.enqueue(1230);
//        System.out.println(queue);
//        StackQueue stackQueue = new StackQueue();
//        stackQueue.enqueue(10);
//        stackQueue.enqueue(20);
//        stackQueue.enqueue(30);
//        stackQueue.dequeue();
//        stackQueue.dequeue();
//        stackQueue.dequeue();
//        stackQueue.dequeue();
//        System.out.println(stackQueue);
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(5);
//        queue.add(1);
//        queue.add(4);
//        queue.add(3);

        PriorityQueue p = new PriorityQueue(5);
        p.insert(10);
        p.insert(10);
        p.insert(20);
        p.insert(30);
        p.insert(15);
        p.remove();
        while (!p.isEmpty())
            System.out.println(p.remove());
    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack();
        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
