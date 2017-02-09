package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * Created by sahilk on 26/01/17.
 */
public class InitializeZero {

        private static int row;
        private static  int col;

        private static void findZerothElement(int [][] array) {
            boolean flag = false;
            for (int outerLoop = 0; outerLoop < array.length; outerLoop++) {
                for (int innerLoop = 0; innerLoop < array[outerLoop].length; innerLoop++) {
                    if (array[outerLoop][innerLoop] == 0) {
                       row = outerLoop;
                       col = innerLoop;
                        flag = true;
                    }
                    if (flag)
                        break;
                }
                if (flag)
                    break;
            }
        }

        private static void replaceRowColWithZero(int [][] array) {
            findZerothElement(array);
            for (int rowLoop = 0; rowLoop < array.length; rowLoop++) {
                for (int columnLoop = 0; columnLoop < array[rowLoop].length; columnLoop++) {
                   if (rowLoop == row || columnLoop == col) {
                       array[rowLoop][columnLoop] = 0;
                   }
                }
            }


            System.out.println(Arrays.deepToString(array));
        }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,0,12},
                {13,18,15,16}
        };
        replaceRowColWithZero(array);
    }
}
