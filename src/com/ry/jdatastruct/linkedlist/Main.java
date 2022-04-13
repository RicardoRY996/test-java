package com.ry.jdatastruct.linkedlist;

import com.ry.jdatastruct.array.Array;

import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
//        System.out.println(list.size());
        list.addLast(20);
        list.addLast(30);
        //list.removeFirst();

//        list.removeLast();
        System.out.println(list.size());
        var a = list.toArray();
        System.out.println(Arrays.toString(a));
        for (int e : a){
            System.out.println(e);
        }
//        list.reverse();
        var b = list.toArray();

        System.out.println();
        System.out.println(list.getKthFromTheEnd(2));
    }
}
