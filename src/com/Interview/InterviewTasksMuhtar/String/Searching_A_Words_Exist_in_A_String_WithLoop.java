package com.Interview.InterviewTasksMuhtar.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Searching_A_Words_Exist_in_A_String_WithLoop {
    static int  index =0;
    public static void main(String[] args) {

        String checkWord = "java";
        String str = "SSfghjgjavagshmjbbh";
        boolean isExist = findExistenceOfAWordInString2(str, checkWord);

        System.out.println("The word 'java' is exist in the string: " + isExist);

//        System.out.println("Word 'java' is exist" + " at the starting index of "
//                + index);
    }
    static String findExistenceOfAWordInString1(String str, String checkWord ) {
        String subStr = "";

        for (int i = 0; i < str.length() - 4; i++) {
            subStr = str.substring(i, i + 4);
            if (subStr.equalsIgnoreCase(checkWord))
                index = str.indexOf(subStr);
        }
        return subStr;
    }

    static boolean findExistenceOfAWordInString2(String str,String checkWord ) {
        boolean isExist = false;
        List<String> splitedString = new ArrayList<>();
        for (int i = 0; i < str.length() - 4; i++)
            splitedString.add(str.substring(i, i + 4));

        for (String each : splitedString)
            if (each.equalsIgnoreCase(checkWord))
                isExist = true;

        return isExist;
    }
}
