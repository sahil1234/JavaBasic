package com.basic.stuff.searching;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sahilk on 09/01/17.
 */
public class ArraySearch {


    private static int [] findFirstRepetedValue(int [] array){

        Map<Integer, Integer> arrayMap= new LinkedHashMap<>();

        for (int loop = 0; loop < array.length; loop++) {
            int count = 1;
            int value = array[loop];
            if (arrayMap.get(value) != null) {
                arrayMap.put(value, arrayMap.get(value) + count);
            } else {
                arrayMap.put(value, count);
            }
        }

        System.out.println(arrayMap.entrySet());
        return array;
    }

    public static void main(String[] args) {
        int array [] = new int[]{2,3,4,6,7,3,3};
        System.out.println("Array after insertion sort -: "+ findFirstRepetedValue(array));
        System.out.println(Math.abs(-18));
    }
}
