package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 25/01/17.
 */
public class MergeTwoListIntoOne {



    private static int[] mergeTwoList(int [] firstArray, int [] secondArray, int firstArraySize, int secondArraySize) {
        int loop = firstArraySize + secondArraySize;

        int [] thirdArray = new int [loop];
        loop = loop - 1;
        int firstArrayCounter = firstArraySize -1;
        int secondArrayCounter = secondArraySize -1;
        for (;loop >= 0 ; loop--) {
            if (secondArrayCounter < 0 ||  (firstArrayCounter >= 0 && firstArray[firstArrayCounter] >
            secondArray[secondArrayCounter]) ) {
                thirdArray[loop] = firstArray[firstArrayCounter];
                firstArrayCounter --;
            } else {
                thirdArray[loop] = secondArray[secondArrayCounter];
                secondArrayCounter --;
            }
        }
        return thirdArray;
    }


    public static void main(String[] args) {
        int array [] = new int[]{1,2,3,4,50};
        int array1 [] = new int[]{6,7,8,9,10};
        System.out.println("Merged array -: "+ Arrays.toString(mergeTwoList(array,array1,5,5)));
    }
}
