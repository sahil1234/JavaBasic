package com.basic.stuff.StringManuplation;

/**
 * Created by sahilk on 09/02/17.
 * he solution wont work if, the first occurrence of character is not the right occurrence.
 Example:
 TextString: abcNjAhNgAhGjhfhAljhRkhgRbhjbevfh
 ^ ^
 Sample string :NAGARRO
 */
public class FindMatchingString {



    public static boolean matchGivenStringByOrder(String input, String matchString) {
        int counter = 0;
        for (int loop = 0; loop < input.length(); loop++) {
            //Check if matchString content is also present in the input string and also check the counter should not
            // be more than the matchString length
            if (counter < matchString.length() &&input.charAt(loop) == matchString.charAt(counter)) {
                counter++;
            }
        }
        if (counter == matchString.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String input = "abcNjAhNgAhGjhfhAljhrkhgbhjbevfh";
        String matchString = "NAGAR";
        System.out.println(matchGivenStringByOrder(input, matchString));
    }
}
