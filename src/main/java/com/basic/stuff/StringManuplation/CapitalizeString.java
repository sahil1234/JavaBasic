package StringManuplation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sahilk on 07/11/16.
 */
public class CapitalizeString {

    private static Set<String> excludedString = new HashSet<String>();

    static{
        excludedString.add("and");
        excludedString.add("of");
        excludedString.add("from");
        excludedString.add("to");
    }

    public CapitalizeString() {
    }

    public static String capitalizeStringFirstChar(String unFormattedString){

        String[] tempString = unFormattedString.split("\\s");
        StringBuilder formattedString = new StringBuilder();
        for (String str : tempString ) {

            if (!excludedString.contains(str)) {
                 formattedString.append(str.substring(0,1).toUpperCase() + str.substring(1,str.length())).append(" ");
            } else {
                formattedString.append(str).append(" ");
            }
        }
        return formattedString.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeStringFirstChar("that contains the text of the String"));
    }
}
