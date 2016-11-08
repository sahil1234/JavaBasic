import java.util.Arrays;

/**
 * Created by sahilk on 07/11/16.
 */
public class QuickSort {


    private static int [] theArray ;
    public static int[] sort(int[] arr){

        theArray = arr;
        int length = arr.length;
        doQuickSort( 0, length - 1);
        return arr;
    }

    private static void doQuickSort(int start, int end) {

        int pivot;
        if (start < end){
            pivot = partition(start, end);
            doQuickSort(start,pivot - 1);
            doQuickSort(pivot + 1, end);
        }
    }

    private static int partition( int start, int end) {

        int pivot = theArray[end];
        int correctPointer = start - 1;
        for (int move = start; move <= end - 1; move++) {
            if (theArray[move] <= pivot){
                correctPointer += 1;
                exchange(correctPointer, move);
            }
        }
        correctPointer += 1;
        exchange(correctPointer, end);
        return correctPointer;
    }

    private static void exchange(int source, int dest) {

        int temp = theArray[dest];
        theArray[dest] = theArray[source];
        theArray[source] = temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{8,7,6,5,4,3,2,1})));
    }
}
