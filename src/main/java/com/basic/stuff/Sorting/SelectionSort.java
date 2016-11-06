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
}
