package com.basic.stuff.StringManuplation;

/**
 * Created by sahilk on 09/02/17.
 */
public class FindLongestString {



    public static String findTheLongestStringFromTheGivenStringArray(String[] strArray) {

        String word = strArray[0];
        for (int loop = 1; loop < strArray.length; loop++) {
            String compareValue = strArray[loop];

            if (validateTwoChars(word.substring(word.length() -1,
                    word.length()), compareValue.substring(compareValue.length() -1, compareValue.length()))) {
                word = word + compareValue.substring(compareValue.length() -1, compareValue.length());
            }
        }
        return null;
    }


    private static boolean validateTwoChars(String start, String end) {
            if(start.equals(end))
                return true;
        return false;
    }
}
