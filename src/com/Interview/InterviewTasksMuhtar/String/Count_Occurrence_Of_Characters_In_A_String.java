package com.Interview.InterviewTasksMuhtar.String;

public class Count_Occurrence_Of_Characters_In_A_String {
    public static void main(String[] args) {
        String str = "Java Programming is Java Oops";
        System.out.println(occurrenceOfCharacter_Of_A_String(str));
    }

    static String occurrenceOfCharacter_Of_A_String(String str){
        int lengthOfOriginalString = str.length();
        int lengthOfString_without_A_SpecificChar;
        String result="";
        for (int i =0; i< str.length();i++){
            str = str.replace(""+str.charAt(i),"");
            System.out.println(str.length());
            lengthOfString_without_A_SpecificChar= lengthOfOriginalString - str.length();
            result =""+ str.charAt(i) +  lengthOfString_without_A_SpecificChar+ " ";

        }

        return result;
    }
}
