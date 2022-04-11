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
        //if the array is full, resize it
        if (items.length == count){
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        //add the new item at the end
        items[count] = item;
        count++;
    }
    //移除方法
    public void removeAt(int index){

        if (index < count && index >= 0){
            for (int i = 0; i < count-index; i++) {
                items[index] = items[index + 1];
                index++;
            }
            count--;
        }else if (index >= count){
            System.out.println("fails");
        }
    }
    //
    public int indexOf(int n){

        return 0;
    }

}
