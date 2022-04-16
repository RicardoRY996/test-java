package com.ry.jdatastruct.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CharFinder i = new CharFinder();
        var n = i.findFirstNonRepeatingChar("i opo ioi j");
        System.out.println(n);
//
//        var a = i.findLastNonRepeatingChar("i opo ioi j");
//        System.out.println(a);
    }

}
