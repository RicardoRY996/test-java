package com.ry.jdatastruct.stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
//        var n = input.length();
//        char[] a = new char[n];
//        char[] b = new char[n];
//        a = input.toCharArray();
//        for (int i = 0; i < input.length(); i++){
//            b[i] = a[n - 1];
//            n--;
//        }
//        var c = String.valueOf(b);
//        return c;

        if (input == null){
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()){
            stack.push(ch);
        }
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
