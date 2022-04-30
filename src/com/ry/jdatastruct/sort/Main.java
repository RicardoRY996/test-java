package com.ry.jdatastruct.sort;

import com.ry.jdatastruct.array.Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] b = {2,1,3,8};
//        BubbleSort a = new BubbleSort();
//        a.sort(b);
//        for (var v : b){
//            System.out.println(v);
//        }
        var sorter = new CountingSort();
        sorter.sort(b, 9);
        System.out.println(Arrays.toString(b));
    }
}
