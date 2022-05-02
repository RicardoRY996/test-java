package com.ry.jdatastruct.search;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 2, 6, 5};
        var search = new Search();
        var index = search.linearSearch(numbers, 7);
        System.out.println(index);
    }
}
