package com.basic.stuff.ArrayProblems;

/**
 * Created by sahilk on 26/01/17.
 */
public class SingleLoopDuplicate {



    private static void findDuplicateInSingleLoop(int[] array) {
        int length = array.length;
        int[] copyArray = new int[length];
        findDuplicateInArray(array, copyArray, length);
    }

    private static void findDuplicateInArray(int[] array, int[] copyArray, int length) {

        int counter = 0;

        for (int loop = 0; loop < length; loop++) {
            int key = array[loop] % length;
            if (copyArray[key] == 0) {
                copyArray[counter] = array[loop];
            } else {

            }
        }
    }



    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,1};
        findDuplicateInSingleLoop(array);
    }
}
