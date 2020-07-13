package com.Interview.InterviewTasksMuhtar.String;

public class Remove_White_Space_in_a_String {
    public static void main(String[] args) {
        String str = "   Java is    a programming    language";
        System.out.println(removeWhiteSpaceOfString(str));
        System.out.println(str.trim());

    }

    static String removeWhiteSpaceOfString(String str){
        String result=str.replaceAll("\\s","");
        return result;
    }
}
