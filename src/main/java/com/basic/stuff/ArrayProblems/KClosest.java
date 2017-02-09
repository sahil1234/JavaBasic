package com.basic.stuff.ArrayProblems;

/**
 * Created by sahilk on 09/02/17.
 * Find k closest elements to a given value
 Given a sorted array arr[] and a value X, find the k closest elements to X in arr[].
 Examples:

 Input: K = 4, X = 35
 arr[] = {12, 16, 22, 30, 35, 39, 42,
 45, 48, 50, 53, 55, 56}
 Output: 30 39 42 45
 Note that if the element is present in array, then it should not be in output, only the other closest elements are required.

 In the following solutions, it is assumed that all elements of array are distinct.
 */
public class KClosest {


    public static void main(String args[])
    {
        KClosest ob = new KClosest();
        int arr[] = {12, 16, 22, 30, 35, 39, 42,
                45, 48, 50, 53, 55, 56
        };
        int n = arr.length;
        int x = 35, k = 4;
        ob.printKclosest(arr, x, k, n);
    }

    private void printKclosest(int[] array, int number, int limit, int length) {
        int left = (findKthElementPosition(array, number));
        if (left == -1) {
            System.out.println("Element not found in array");
            return;
        }

        int count = 0;
        int right = left +1;
        left = left -1;


        while (count < limit && left > 0 && right < length) {
            if(number - array[left] < array[right] - number) {
                System.out.println(" The element is ---> "+array[left]);
                left--;
                count++;
            } else {
                System.out.println(" The element is ---> "+array[right]);
                right++;
                count++;
            }
        }

        while (count < limit && right > length) {
            System.out.println("The element is ----> " + array[left]);
            left--;
            count++;
        }

        while (count < limit && left < 0) {
            System.out.println("The element is ----> " + array[right]);
            right++;
            count++;
        }
    }

    private int findKthElementPosition(int[] arr, int findElement) {

        for (int loop = 0; loop < arr.length; loop++) {
            if( findElement == arr[loop])
                return loop;
        }
        return -1;
    }
}
