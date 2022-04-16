package com.ry.jdatastruct.queue;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stackOne = new Stack<>();
    private Stack<Integer> stackTow = new Stack<>();
    private int count = 0;
    public void enqueue(int item){
        //myWay
        stackOne.push(item);
        count++;
        //otherWay
//        stackOne.push(item);
    }
    public int dequeue(){
        //Q[1, 2, 3]
        //S[3, 2]
        //S[3, 2]
        //count = 2

        //myWay
        if (stackOne.isEmpty()){
            throw new IllegalStateException();
        }

        for (int i = 0; i < count; i++){
            stackTow.push(stackOne.pop());
        }
        stackTow.pop();
        count--;
        while (!stackTow.isEmpty()){
            stackOne.push(stackTow.pop());
        }
        return 0;
        //otherWay
//        if (stackOne.isEmpty() && stackTow.isEmpty()){
//            throw new IllegalStateException();
//        }
//        extracted();
//        return stackTow.pop();
    }
    public int peek(){
        if (stackOne.isEmpty() && stackTow.isEmpty()){
            throw new IllegalStateException();
        }
        extracted();

        return stackTow.peek();
    }

    private void extracted() {
        if (stackTow.isEmpty()){
            while (!stackOne.isEmpty()){
                stackTow.push(stackOne.pop());
            }
        }
    }
    public boolean isEmpty(){
        return stackOne.isEmpty() && stackTow.isEmpty();
    }
}
