package com.ry.jdatastruct.sort;

public class QuickSort {
    public void sort(int[] array){
        sort(array, 0, array.length - 1);

    }

    public void sort(int[] array, int start, int end){
        if (start >= end){
            return;
        }

        var boundary = partition(array, start, end);

        sort(array, start, boundary - 1);;
        sort(array, boundary + 1, end);

    }
    private int partition(int[] array, int start, int end){
        var pivot = array[end];
        var boundary = start - 1;
        for (var i = start; i < end; i++){
            if (array[i] <= pivot){
                boundary++;
                swap(array, i, boundary);
            }
        }
        return boundary;
    }

    private void swap(int[] array, int indexOne, int indexTwo){
        var temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
