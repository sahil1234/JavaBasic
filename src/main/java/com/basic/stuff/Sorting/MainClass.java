import java.util.Arrays;

/**
 * Created by sahilk on 06/11/16.
 */
public class MainClass {


    public static void main(String[] args) {
        int array [] = new int[]{2,1,5,4,-9,-60};
        //System.out.println("Array after insertion sort -: "+ Arrays.toString(InsertionSort.Sort(array)));
        //array = SelectionSort.Sort(array);
        array = BubbleSort.Sort(array);

    }
}
