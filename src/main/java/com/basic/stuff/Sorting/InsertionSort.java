/**
 * Created by sahilk on 06/11/16.
 */
public class InsertionSort {


    /**
     * The time complexity for this inseertion sort is
     * BestΩ(n)	Average Θ(n^2)	 Worst O(n^2)
     * @param array
     * @return
     */
    public static int[] Sort(int [] array){
        for(int outerLoop = 1; outerLoop< array.length; outerLoop++){
            int temp;
            for(int innerLoop = 0; innerLoop < outerLoop ; innerLoop++){
                if(array[outerLoop] < array[innerLoop]){
                    temp = array[outerLoop];
                    array[outerLoop] = array[innerLoop];
                    array[innerLoop] = temp;
                }
            }
        }
        return array;
    }

}
