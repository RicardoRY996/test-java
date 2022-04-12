package com.ry.jdatastruct.array;

public class Array {
    private int[] items;
    private int count;


    //数组构造器
    public Array(int length) {
        items = new int[length];
    }

    //print
    public void print(){
        for (int i = 0; i < count; i++){
            System.out.println(items[i]);;
        }
    }

    //插入方法
    public void insert(int item){
        if (items.length == count){
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }

            items = newItems;
        }
        items[count] = item;
        count++;
    }
    //移除方法
    public void removeAt(int index){

        if (index < count && index >= 0){
            for (int i = index; i < count; i++) {
                items[i] = items[i+1];
            }
            count--;
        }else if (index >= count || index < 0){
            throw new IllegalArgumentException();
        }
    }
    //
    public int indexOf(int item){
        for (int i = 0; i < count; i++){
            if (items[i] == item){
                System.out.println("index is " + i + ".");
                return i;
            }
        }
        System.out.println("no this value.");
        return -1;
    }
}
