package com.ry.jfoundation.welcome;

public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0;i<greeting.length(); i++)
            System.out.println("=");
        System.out.println();

        //练习
        test test = new test();
        test.test();
    }
    public static class test{
        void test(){
            String greeting = "Welcome to Java!";
            System.out.println(greeting);
            for (int n = 0; n <= greeting.length(); n++)
                System.out.println("power!!!");

        }
    }
}
