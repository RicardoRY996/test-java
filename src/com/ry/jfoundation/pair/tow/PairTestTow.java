package com.ry.jfoundation.pair.tow;

import com.ry.jfoundation.pair.Pair;

import java.time.LocalDate;

public class PairTestTow {
    public static void main(String[] args) {
        LocalDate[] birthdays = {
                LocalDate.of(1906, 12, 9), //G. Hopper
                LocalDate.of(1815, 12, 10), //A. Lovelace
                LocalDate.of(1903, 12, 3), //J. von Neumann
                LocalDate.of(1910, 6, 22), //K. Zuse
        };

    }
}
class ArrayAlg{
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0){
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 1; i < a.length; i++){
            if (min.compareTo(a[i]) > 0){
                min = a[i];
                max = a[i];
            }
        }
        return new Pair<>(min, max);
    }
}