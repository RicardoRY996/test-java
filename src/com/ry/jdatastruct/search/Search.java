package com.ry.jdatastruct.search;

public class Search {
    public int linearSearch(int[] array, int target){
        for (var i = 0; i < array.length; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int binarySearchRec(int[] array, int target){
        return binarySearchRec(array, target, 0, array.length - 1);
    }

    private int binarySearchRec(
            int[] array, int target, int left, int right){

        if (right < left){
            return -1;
        }


        int middle = (left + right) / 2;
        if (array[middle] == target){
            return middle;
        }

        if (target < array[middle]){
            return binarySearchRec(array, target, left, middle - 1);
        }

        return binarySearchRec(array, target, middle + 1, right);
    }

    public int binarySearch(int[] array, int target){
        var left = 0;
        var right = array.length - 1;

        while(left <= right){
            var middle = (left + right) / 2;

            if (array[middle] == target){
                return middle;
            }

            if (target < array[middle]){
                right = middle - 1;
            }else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public int ternarySearch(int[] array, int target){
        return ternarySearch(array, target, 0, array.length - 1);
    }

    private int ternarySearch(
            int[] array, int target, int left, int right){

        if (left > right){
            return -1;
        }
        int partitionSize = (right - left) / 3;
        int midOne = left + partitionSize;
        int midTwo = right - partitionSize;

        if (array[midOne] == target){
            return midOne;
        }

        if (array[midTwo] == target){
            return midTwo;
        }

        if (target < array[midOne]){
            return ternarySearch(array, target, left, midOne - 1);
        }

        if (target > array[midTwo]){
            return ternarySearch(array, target, midTwo + 1, right);
        }
        return ternarySearch(array, target, midOne + 1, midTwo - 1);
    }

    public int jumpSearch(int[] array, int target){
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length &&
                array[next - 1] < target){
            start = next;
            next += blockSize;
            if (next > array.length){
                next = array.length;
            }
        }
        for (var i = start; i < next; i++){
            if (array[i] == target){
                return i;
            }
        }
        return -1;
    }

    public int exponentialSearch(
            int[] array, int target){
        int bound = 1;
        while(bound < array.length && array[bound] < target){
            bound *= 2;
        }
        int left = bound / 2;
        int right = Math.min(bound, array.length - 1);

        return binarySearchRec(array, target, left, right);
    }

}
