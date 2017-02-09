import java.util.Arrays;

/**
 * Created by sahilk on 06/11/16.
 */
public class InsertionSort {


    /**
     * The time complexity for this insertion sort is
     * BestΩ(n)	Average Θ(n^2)	 Worst O(n^2)
     * @param array
     * @return
     */
    public static int[] sort(int [] array){
        for(int outerLoop = 1; outerLoop< array.length; outerLoop++){
            int valueToSort = array[outerLoop];
            int innerLoop = outerLoop;

            while (innerLoop > 0 && array[innerLoop -1] > valueToSort) {
                array[innerLoop] = array[innerLoop -1];
                innerLoop--;
            }
            array[innerLoop] = valueToSort;
        }
        return array;
    }

    public static void main(String[] args) {
        int array [] = new int[]{2,1,5,4,-9,-60};
        System.out.println("Array after insertion sorts -: "+ Arrays.toString(sort(array)));
    }

}
