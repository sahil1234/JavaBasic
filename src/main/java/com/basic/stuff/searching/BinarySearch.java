package com.basic.stuff.searching;

/**
 * Created by sahilk on 08/01/17.
 */
public class BinarySearch {

    private static int search(int[] array, int length, int data){
        int start = 0 , end = length -1, mid;

        while (start <= end) {
            mid = (start + end) /2;
            if(array[mid] == data) {
                return data;
            } else if ( data < array[mid]) {
                    end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array [] = new int[]{-60,-9,2,4,8,90};
        System.out.println("searched element is  -: "+ search(array, array.length, 8));
    }
}
