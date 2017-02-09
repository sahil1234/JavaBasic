package com.basic.stuff.ArrayProblems;

/**
 * Created by sahilk on 03/02/17.
 */
public class FindMissingNumber {

    /**
     * Sort array and then do loop and if next element in loop is not previous+1 then it is missing one.
     * Save previous value to separate variable for more distincts numbers one after another.
     *
     * This can find N number of missing elements in an array from 1 to n range
     * This previous number is incremented every time by 1 and is compared with the element in the array if it is not
     * equal to that it means that element is missing and we print that element and only if the previous == element
     * then we increment the loop counter which means till this element we have found all the missing elements.
     * @param array
     *
     */
    public static void findMoreThanOneMissingNumber(int[] array) {
        int previous = 0;
        int loop = 0;
        do {
            previous++;
            if (previous != array[loop]) {
                System.out.println(previous);
            } else {
                loop++;
            }
        } while (loop < array.length);
    }


    public static void main(String[] args) {
        int [] array = new int[]{4};
        findMoreThanOneMissingNumber(array);
    }
}
