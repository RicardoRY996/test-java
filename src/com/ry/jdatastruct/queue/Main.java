package com.ry.jdatastruct.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

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
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(10);
        queue.enqueue(120);
        queue.enqueue(1230);
        System.out.println(queue);
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
