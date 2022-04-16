package com.ry.jdatastruct.queue;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int size = 0;
    private int count = 0;

    public PriorityQueue(int length){
        items = new int[length];
    }

    public void insert(int item){
        //myWay
        if (size == items.length){
            throw new IllegalStateException();
        }
        if (size == 0){
            items[size] = item;
        }else if (size >= 1){
            while (item < items[size - 1]){
                items[size] = items[size - 1];
                items[size - 1] = item;
                size--;
            }
        }
        items[size] = item;
        count++;
        size = count;
        //otherWay
//        if (isFull()){
//            throw new IllegalStateException();
//        }
//        var i = shiftItemsToInsert(item);
//        items[i] = item;
//        count++;
    }

    public int shiftItemsToInsert(int item){
        int i;
        for (i = count - 1; i >= 0; i--){
            if (items[i] > item){
                items[i + 1] = items[i];
            }else {
                break;
            }
        }
        return i + 1;
    }

    public int remove(){
        if (isEmpty()){
            throw new IllegalStateException();
        }
        --count;
        size = count;
        return items[size];
    }
    public boolean isFull(){
        return count == items.length;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public String toString(){
        return Arrays.toString(items);
    }

}
