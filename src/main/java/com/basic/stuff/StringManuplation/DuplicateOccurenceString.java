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

    public static void main(String[] args) {
        System.out.println(findDuplicateOccurenceWithoutLoop("sssssss","s"));
        countCharacterOccurenceInString("sahillll");
    }
}
