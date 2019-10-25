package com.Alevel;

import java.util.Objects;

public class MinMaxArr {

    public static <T extends Comparable<T>> T MaxArr(T []arr){
        T max = null;
        for(int i =0;i<arr.length;i++) {
            if(arr[i]!=null) {
                max = arr[i];
                break;
            }
        }
        if (max ==null){
            return null;
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i]!=null) {
                max = arr[i].compareTo(max) > 0 ? arr[i] : max;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T MinArr(T []arr){
        T min = null;
        for(int i =0;i<arr.length;i++) {
            if(arr[i]!=null) {
                min = arr[i];
                break;
            }
        }
        if (min ==null){
            return null;
        }
        for (T i:arr){
            if(i==null){
                return null;
            }
            min = i.compareTo(min)<0?i:min;
        }
        return min;
    }
}
