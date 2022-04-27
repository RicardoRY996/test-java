package com.ry.jdatastruct.sort;

public class Main {
    public static void main(String[] args) {
        int[] b = {2,1,8,4,9,7,3};
        BubbleSort a = new BubbleSort();
        a.sort(b);
        for (var v : b){
            System.out.println(v);
        }
    }
}
