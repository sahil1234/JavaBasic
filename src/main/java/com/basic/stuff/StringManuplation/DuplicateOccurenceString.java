package StringManuplation;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by sahilk on 07/11/16.
 */
public class DuplicateOccurenceString {

    public DuplicateOccurenceString() {
    }
    //sahilkohli
    /**
     *
     * @param duplicateString
     * @return
     */
    public static int findDuplicateOccurenceWithoutLoop(String duplicateString, String repeatedChar){
        return duplicateString.length() - duplicateString.replace(repeatedChar,"").length();
    }

    /**
     *
     * @param randonString
     */
    public static void countCharacterOccurenceInString(String randonString){
        Map<Character, Integer> countmap = new LinkedHashMap<Character, Integer>();

        for(Character value : randonString.toCharArray()){
                if(countmap.containsKey(value)){
                    countmap.put(value, countmap.get(value) + 1);
                    continue;
                }
            countmap.put(value,1);
        }
        System.out.println(countmap);
    }

    /**
     *
     * @param randomString
     * @return
     */
    public static boolean checkOnlyDigits(String randomString){
        for (int loop = 0; loop < randomString.length(); loop++) {
            int value = (int)randomString.charAt(loop);
            //ascii value for digits is between 48 - zero to 57 - nine
            if(!(value >= 48 && value <= 57)){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param randomString
     * @return
     */
    public static String replaceSpaceWithPercentage(String randomString){
        return randomString.replace(" ","%20");
    }

    /**
     *
     * @param randomString
     * @return
     */
    public static boolean findUniqueCharacterInStringOrNot(String randomString){

        char[] charArray = randomString.toCharArray();
        for (int loop = 0; loop < charArray.length; loop++) {
            if(randomString.indexOf(charArray[loop]) != randomString.lastIndexOf(charArray[loop])){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(String.format("The occurence of char [%s] is -: ","s")+findDuplicateOccurenceWithoutLoop
                ("sssssss","s"));
         countCharacterOccurenceInString("sahillll");
        System.out.println("Check if only digits or not " +checkOnlyDigits("32u"));
        System.out.println("Replaced all space with %20 the string is -:"+ replaceSpaceWithPercentage("sahil kohli"));
        System.out.println("The String contains only digits -:" + findUniqueCharacterInStringOrNot("sahill"));
    }
}
