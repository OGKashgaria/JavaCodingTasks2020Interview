package com.Interview.InterviewTasksMuhtar.String;

public class Searching_A_Words_Exist_in_A_String_WithLoop {
    public static void main(String[] args) {
        String str = "SSfghjgjjavagshmjbbh";
        findDups(str);
    }
    static void findDups(String str) {
        String subStr = "";
        for (int i = 0; i < str.length() - 4; i++) {
            subStr = str.substring(i, i + 4);
            if (subStr.equalsIgnoreCase("java"))
                System.out.println("Word 'java' is exist" + " at the starting index of "
                        + str.indexOf(subStr));
        }
    }
}
