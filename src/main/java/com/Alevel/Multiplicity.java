package com.Alevel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Multiplicity {
    public static int[] Mult(int[] arr, int k){
        if (arr == null){
            return null;
        }
        if (arr.length == 0){
            return arr;
        }
        if(k == 0){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();

            for (int i : arr) {
                if (i % k == 0) {
                    list.add(i);
                }
            }

        int[]arrNew = new int[list.size()];
        for(int i = 0; i<list.size();i++){
            arrNew[i]=list.get(i);
        }
        return arrNew;
    }
}
