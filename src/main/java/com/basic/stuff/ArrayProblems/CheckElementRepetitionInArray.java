package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 25/01/17.
 */
public class CheckElementRepetitionInArray {



    private static boolean  checkElementRepetition(int [] array){

        Arrays.sort(array);
        for (int loop = 0; loop < array.length - 1; loop++) {
            if (array[loop] == array[loop +1]) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int array [] = new int[]{2,1,5,4,2,-60};
        System.out.println("Check element repetition in array -: "+ checkElementRepetition(array));
    }
}
