import java.util.Arrays;

/**
 * Created by sahilk on 06/11/16.
 */
public class SelectionSort {

    /**
     * During each pass, the unsorted element with the smallest (or largest) value is moved to its
     * proper position in the array.
     * The complexity of this sort is
     * Best Ω(n^2)	Average Θ(n^2)	Worst O(n^2)	Space Worst O(1)
     * @param array
     * @return
     */
    public static int [] Sort(int[] array){

        for (int outerLoop = 0; outerLoop < array.length -1; outerLoop++) {
            int temp, position = outerLoop;
            for (int innerLoop = outerLoop+1; innerLoop < array.length ; innerLoop++) {
                if(array[position] > array[innerLoop]){
                    position = innerLoop;
                }
            }

            temp = array[outerLoop];
            array[outerLoop] = array[position];
            array[position] = temp;
        }
        return array;
    }


    private static int[] testSort(int[] arr){
        int length = arr.length, position, temp;
        for (int outerLoop = 0; outerLoop < length -1; outerLoop++) {
            position = outerLoop;

            for (int innerLoop = outerLoop +1; innerLoop < length; innerLoop++) {
                if (arr[position] > arr[innerLoop]){
                    position = innerLoop;
                }
            }

            temp = arr[position];
            arr[position] = arr[outerLoop];
            arr[outerLoop] = temp;
        }
        return  arr;
    }

    public static void main(String[] args) {
        int array [] = new int[]{-2,1,5,4,-9,-60};
        //
        //-60,1,5,4,-9,-2
        //-60,-9,5,4,1,-2
        System.out.println("Array after insertion sort -: "+ Arrays.toString(testSort(array)));
    }
}
