package Coding;

/**
 * Created by sahilk on 23/12/16.
 */


/**
 *
           1
         121
       12321
     1234321
   123454321
 12345654321
 */
public class PatternDemo {

private static void  printPattern(){

    int n = 5;
    int spaceCount = n +3;
    for (int loop = 1; loop <= n; loop++) {
        for (int spaceLoop = spaceCount; spaceLoop >= 1; spaceLoop--) {
            System.out.print(" ");
        }
        spaceCount-=2;
        for(int firstLoop = 1; firstLoop<= loop; firstLoop++){
            System.out.print(firstLoop);
        }
        for(int secondLoop = loop -1; secondLoop> 0; secondLoop--){
            System.out.print(secondLoop);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        printPattern();
    }

}
