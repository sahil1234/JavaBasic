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
        return theArray;
    }

    private static void doQuickSort(int start, int end) {

        int currentPos;
        if (start < end){
            currentPos = partition(start, end);
            doQuickSort(start, currentPos - 1);
            doQuickSort(currentPos + 1, end);
        }
    }

    /**
     * The partition logic used here is.
     * Always consider one pivot element is array it can be starting ,ending or any middle element of the array
     * After having that pivot element this partition method will run to place this element to it's right place in the
     * array. By the right position we mean that the element on the left side of the pivot array will be less than it
     * and right side element will be more than it. It doesn't mean that the element on left or right side will be
     * sorted No it just means that after one cycle of partition method that pivot element will be on its right
     * position.
     * @param start
     * @param end
     * @return
     */
    private static int partition( int start, int end) {

        int pivot = theArray[end];
        int correctPointer = start - 1;
        // Run this loop just one less than the last element
        for (int move = start; move <= end - 1; move++) {
            if (theArray[move] <= pivot){
                correctPointer += 1;
                exchange(correctPointer, move);
            }
        }
        //This replaces the last element with next correctPointer element this means that after the for loop
        //correctPointer++ is the correct place for the pivot element.
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

        System.out.println(Arrays.toString(tempSort(new int[]{-1,-2,-6,-5,4,3,2,1})));
    }

    public static int[] tempSort(int arr[]) {
        theArray = arr;
        int length = theArray.length;
        applyQuickSort(0,length -1);
        return theArray;
    }

    private static void applyQuickSort(int start, int end) {
        int currentPosition;
        if (start < end) {
            currentPosition = tempDoPartition(start, end);
            applyQuickSort(start, currentPosition -1);
            applyQuickSort(currentPosition+1 , end);
        }
    }

    private static int tempDoPartition(int start, int end) {
        int pivot = theArray[end];
        int currentPosition = start -1;
        for (int move = start; move <= end - 1; move++) {
            if (theArray[move] <= pivot){
                currentPosition += 1;
                exchange(currentPosition,move);
            }
        }
        currentPosition += 1;
        exchange(currentPosition,end);
        return currentPosition;
    }


}
