package com.basic.stuff.ArrayProblems;

import java.util.Arrays;

/**
 * To check weather there is an elemnt in an array which is in majority which means is there an element occurrence is
 * N/2 times.
 * Created by sahilk on 05/02/17.
 */
public class ElementMajorityArray {



    public static int checkElementMajorityInArray(int[] array) {
        int length = array.length;
        int counter = 0;
        Arrays.sort(array);
        int element =0;
        for (int loop = 0; loop < length; loop++) {

            if(counter == 0) {
                counter++;
                element = array[loop];
            } else if (array[loop] == element) {
                counter++;
            } else {
                counter--;
            }
        }
        return counter >= 0 ? element : -1;
    }


    public static int findMajorityWithSortedSingleScan(int[] array){
        int length = array.length;
        int counter = 0;
        int element = array[0];
        int majorityElement = element;
        int maxCount =0;
        Arrays.sort(array);
        for (int loop = 0; loop < length ; loop++) {
            if (array[loop] == element) {
                counter++;
                maxCount++;
                majorityElement = element;
            } else {
                element = array[loop];

            }

        }

return -1;
    }

    public static int countClumps(int[] nums) {
        int  count=0;
        if(null!=nums && nums.length > 0)
        {
            final int len=nums.length;

            int currentInt = nums[0];//this is to store current element in loop, default is first value
            int sameNumCount = 0; // this is to store count of same number found consecutely
            for(int i=1;i<len;i++)
            {
                if(currentInt!=nums[i])
                {
                    currentInt = nums[i];
                    // increment count if same number count is greater than 0
                    if(sameNumCount > 0)
                    {
                        count++;
                    }
                    sameNumCount = 0; // reset same number count
                }
                else
                {
                    sameNumCount++;
                }

            }

            // to handle last same number count
            // e.g - for countClumps({1, 2, 2, 3, 4, 4}), for last 4 loop will go into
            // else part and count will not get increased.
            if(sameNumCount > 0)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,2,33,10,3,4,5,2,2,1,1,1};
        System.out.println(countClumps(array));
    }
}
