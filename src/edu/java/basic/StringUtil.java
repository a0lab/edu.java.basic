package edu.java.basic;

public class StringUtil {

    public static String reverse (String inputString) {
        char[] inputArray = inputString.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = inputArray.length-1; i >=0 ; i--) {
            sb.append(inputArray[i]);
        }
        return sb.toString();
    }
}
