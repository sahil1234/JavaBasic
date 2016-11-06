/**
 * Created by sahilk on 07/11/16.
 */
public class BubbleSort {

    public static int [] Sort(int[] array){

        for (int outerLoop = 0; outerLoop < array.length -1; outerLoop++) {
            for (int innerLoop = outerLoop+1; innerLoop < array.length ; innerLoop++) {
                    if(array[innerLoop] < array[outerLoop]){
                        int temp = array[outerLoop];
                        array[outerLoop] = array[innerLoop];
                        array[innerLoop] = temp;
                    }
            }
        }
        return array;
    }
}
