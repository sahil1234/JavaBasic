package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 26/01/17.
 */
public class ArrayZigZag {



    private static void zigZag(int [] array) {
        boolean flag = true;

        for (int loop = 0; loop < array.length - 2; loop++) {
            if (flag) {
                if (array[loop] > array[loop+1])
                    swap(array, loop, loop+1);
            } else {
                if (array[loop] < array[loop+1])
                    swap(array, loop, loop+1);
            }
            flag = !flag;
        }
    }

    private static void swap(int [] array, int left, int right) {
        int temp;
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


    public static void main(String[] args) {
        int [] array = {2,3,4,5,8,9};
        zigZag(array);
        System.out.println(Arrays.toString(array));
    }


}
