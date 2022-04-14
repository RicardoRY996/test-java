package com.ry.jdatastruct.stack;

import java.util.Arrays;

public class Stack {
    private int count;
    private int[] items;

    public Stack(int length){
        items = new int[length];
    }

    public void push(int item){
        if (items.length == count){
            throw new StackOverflowError();

//            var newItems = new int[count + 1];
//            count++;
//            for (int i = 0; i < count; i++){
//                newItems[i] = items[i];
//            }
//            items = newItems;
        }else {
            items[count] = item;
            count++;
        }
    }
    public void pop(){
        if (count == 0){
            throw new IllegalStateException();
        }else {
            count--;
        }
    }

    public int peek(){
        if (count == 0){
            throw new IllegalStateException();
        }
        return items[count - 1];
    }
    @Override
    public String toString() {
        var content = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(content);
    }
}
