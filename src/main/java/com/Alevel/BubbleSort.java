package com.Alevel;

/**
 * Implements bubble sort algorithm
 * @author Mykyta Zemnytskyi
 * @version 1.0
 *
 */
public class BubbleSort {

    /**
     * @param arr array to sort
     * @param <T> element type
     * @return sorted array
     */
    public static <T extends Comparable<T>> T[] sort(T []arr){

        boolean isSorted = false;
        T buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] != null){
                    if(arr[i+1] == null || arr[i].compareTo(arr[i+1])>0){
                        isSorted = false;
                        buf = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = buf;
                    }
                }
            }
        }
        return arr;
    }
}
