package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 25/01/17.
 */
public class DuplicateArray {


    private static void checkDuplicateElementUsingAbs(int [] array){
        for (int loop = 0; loop < array.length; loop++) {
            if (Math.abs(array[loop]) < 0) {
                System.out.println("Duplicate exist" + array[loop]);
            } else {
                array[array[loop]] = - array[array[loop]];
            }
        }
    }

    private static int firstOccurrenceOfRepeatedValue(int [] array, int data) {
        return findFirstOccurrence(array, 0, array.length, data);
    }

    private static int findFirstOccurrence(int[] array, int start, int end, int data) {

        if (start < end) {
            int mid = start + (end - start) / 2;
            if ( (mid == start && array[mid] == data) || (array[mid] == data && array[mid -1] < data)) {
                return mid;
            } else if (array[mid] >= data) {
               return findFirstOccurrence(array, start, mid, data);
            } else {
                return findFirstOccurrence(array, mid +1, end, data);
            }
        }
        return -1;
    }

    private static int [] placeEvenBeforeOddElements(int[] array) {

        int left = 0;
        int right = array.length -1;

        while (left < right) {
            if (array[left] % 2 == 0 && left < right) {
                left++;
            } else if (array[right] % 2 == 1 && left < right) {
                right--;
            } else {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return array;
    }

    private static void swap(int [] array, int left, int right) {
        int temp;
        temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    private static void findCommonElements(int [] firstArray, int[] secondArray, int[] thirdArray) {
        int firstCounter = 0 , secondCounter =0 , thirdCounter = 0;

        while (firstCounter < firstArray.length && secondCounter < secondArray.length && thirdCounter < thirdArray
                .length) {
            if (firstArray[firstCounter] == secondArray[secondCounter] && firstArray[firstCounter] ==
                    thirdArray[thirdCounter]) {
                System.out.print(firstArray[firstCounter] +" ");
                firstCounter++;
                secondCounter++;
                thirdCounter++;
            } else if (firstArray[firstCounter] <= secondArray[secondCounter] && firstArray[firstCounter] <=
                    thirdArray[thirdCounter]) {
                firstCounter++;
            } else if (secondArray[secondCounter] <= firstArray[firstCounter] && secondArray[secondCounter] <=
                    thirdArray[thirdCounter]) {
                secondCounter++;
            } else {
                thirdCounter++;
            }
        }
    }

    public static void main(String[] args) {
        int array1 [] = new int[]{30,7,8,9,10,90};
        int [] A = {1,2,3,4,5,6,7,8,9,10};
        int [] B = {1,3,5,6,7,8,12};
        int [] C = {2,3,4,5,8,9};
        System.out.println("Merged array -: "+ firstOccurrenceOfRepeatedValue(array1, 8));
        System.out.println("the even first are---->" + Arrays.toString(placeEvenBeforeOddElements(array1)));
        System.out.print("The common elements are -----> : ");
        findCommonElements(A, B, C);
    }
}
