package StringManuplation;

/**
 * Created by sahilk on 07/11/16.
 */
public class StringReverse {

    public StringReverse() {
    }


    //Java Program To Reverse The String With Preserving The Position Of Spaces?
    /**
     *
     * @param randonString
     * @return
     */
    public static String reverseStringWithPreservingSpaces(String randonString){
        int len = randonString.length();
        char arr[] = randonString.toCharArray();
        for(int i=0, j = len-1; i<=j; i++,j--){
            if(arr[i] == ' ') i++;
            if(arr[j] == ' ') j--;

            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseStringWithPreservingSpaces("s ahilkohl i"));//5 55 554 4443 33221
    }
}
