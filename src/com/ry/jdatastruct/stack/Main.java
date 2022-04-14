package com.ry.jdatastruct.stack;

public class Main {
    public static void main(String[] args) {
//        Stack<Integer> stack= new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        var top = stack.pop();
//
//
//        String b = "hnj";
//        StringReverser stringReverser = new StringReverser();
//        var n = stringReverser.reverse(b);
//        System.out.println(n);

        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.pop();
        var a = stack.peek();
        System.out.println(a);
        System.out.println(stack.toString());
    }
}
