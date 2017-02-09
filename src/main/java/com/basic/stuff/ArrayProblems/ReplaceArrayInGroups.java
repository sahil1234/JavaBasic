package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 26/01/17.
 */
public class ReplaceArrayInGroups {
    /**
     * Do an in place swap of elements
     * Logic here is to start swapping elements from starting till the input number i.e (4) replace first 4 elements
     * then increment the start as end and increment END with input number.
     * @param array
     * @param input
     */
    private static void reverse(int [] array, int input) {
        int start = 0;
        int end = input - 1;
        int i = start;
        int j =end;

        if (input <= 0 || input > array.length) {
            return;
        }

        while (true) {
            // This if will do the In place swap of elements
            if(i <= j && i < array.length && j < array.length) {
                swap(array, i, j);
                i++;
                j--;
            } else if (i > j) { // this check will increment the start point and end point with the input number
                start = end +1 ;
                end = end + input;
                i =  start;
                j = end;
            } else if (array.length - end < input) { // this is the break statment when to reach the end of the array
                // or the elements left are less than the input number
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int start, int end) {
            int temp;
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        reverse(array, 11);
    }

}
