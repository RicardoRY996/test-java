package com.ry.jdatastruct.sort;

public class SelectionSort {
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++){
            var minIndex = i;
            for (var j = i; j < array.length; j++){
                if (array[i] < array[minIndex]){
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }
    private void swap(int[] array, int indexOne, int indexTwo){
        var temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }
}
