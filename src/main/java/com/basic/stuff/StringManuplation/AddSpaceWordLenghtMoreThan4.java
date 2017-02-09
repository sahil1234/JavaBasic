package com.basic.stuff.StringManuplation;

import java.util.Arrays;

/**
 * Created by sahilk on 03/02/17.
 */
public class AddSpaceWordLenghtMoreThan4 {


    /**
     * Nagarro is my Favourite Company because of career growth
     * @param sentence
     * @return
     */
    public static String addSpaceWordlengthMoreThanFour(String sentence) {
        String[] sentenceArray = sentence.split(" ");
        for (int place = 0; place < sentenceArray.length; place++) {
            int length = sentenceArray[place].length();
            if (length > 4 && length % 2 == 0) {
                StringBuilder builder = new StringBuilder(sentenceArray[place]);
                sentenceArray[place] = builder.insert(3, " ").toString();
            }
        }
        String str1 = Arrays.toString(sentenceArray);
        //replace starting "[" and ending "]" and ","
        str1 = str1.substring(1, str1.length() - 1).replaceAll(",", "");
        return str1;
    }


    public static void main(String[] args) {
        System.out.println(addSpaceWordlengthMoreThanFour("Nagarro is my Favourite Company because of career growth"));
    }
}
