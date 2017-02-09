package com.basic.stuff.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by sahilk on 03/02/17.
 */
public class ResortArrayWithAbsoluteValue {


    /**
     * Ex. A = {-8,-5,-3,-1,3,6,9}
     * Output: {-1,-3,3,-5,6,-8,9}
     * @param array
     * @return
     *1,-3,-5,-8 --- 3,6,9
     * Split the array in to two halves, one with negative numbers and the other with positive numbers.

    Reverse the negative numbers array.

    Then, run merging algorithm with the absolute value of both the arrays.
     */
    private static int[] positiveArray;
    private static int[] negativeArray;
    public static  int[] resortArrayWithAbsoluteValues(int [] array) {

        int length = array.length;
        int loop = length -1;
        getReversedNegativeList(array);

        int positiveCounter = positiveArray.length -1;
        int negativeCounter = negativeArray.length -1;
        int[] resultArray = new int[length];
        for (;loop >= 0; loop--) {
            if (positiveCounter < 0) {
                resultArray[loop] = negativeArray[negativeCounter];
                negativeCounter--;
            } else if (negativeCounter < 0) {
                resultArray[loop] = positiveArray[positiveCounter];
                positiveCounter--;
            } else if(positiveArray[positiveCounter] >= Math.abs(negativeArray[negativeCounter])) {
                resultArray[loop] = positiveArray[positiveCounter];
                positiveCounter--;
            } else if (Math.abs(negativeArray[negativeCounter]) > positiveArray[positiveCounter]){
                resultArray[loop] = negativeArray[negativeCounter];
                negativeCounter--;
            }
        }
       return  resultArray;
    }

    private static void getReversedNegativeList(int[] array) {
        List<Integer> reverseList = new ArrayList<>();
        List<Integer> positiveList = new ArrayList<>();

        for (int loop = 0; loop <= array.length -1; loop++) {
            if (array[loop] < 0) {
                reverseList.add(array[loop]);
            } else {
                positiveList.add(array[loop]);
            }
        }
        //-8,-5,-3,-1
        positiveArray = new int[positiveList.size()];
         negativeArray = new int[reverseList.size()];
        int position =0;
        for(int i = reverseList.size()- 1; i >= 0; i--) {

            negativeArray[position] = reverseList.get(i);
            position++;
        }

        for(int i = 0; i < positiveList.size(); i++) {
            positiveArray[i] = positiveList.get(i);
        }

    }

    /**
     * You could sort the array then iterate through the array and find the first missing element.
     * @param array
     * @return
     */
     public static int findLowestMissingNumber(int[] array) {
    
         Arrays.sort(array);
         for (int loop = 0; loop < array.length -1; loop++) {
             if(array[loop+1] - array[loop] > 1) {
                 return array[loop] +1;
             }
         }
         return -1;
     }

    public static void main(String[] args) {
        int array [] = new int[]{-8,-5,-3,-1,3,6,9};
        System.out.println("Check element repetition in array -: "+ Arrays.toString(resortArrayWithAbsoluteValues
                (array)));
        int[] findMissing = new int[]{5, -3, 2, 1, 0, -2, 4, -1, 7};
        System.out.println("Lowest missing number is : "+findLowestMissingNumber(findMissing));
    }
}
