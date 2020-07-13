package com.Interview.InterviewTasksMuhtar.String;

import java.util.Arrays;

public class Count_The_Words_in_A_String {
    public static void main(String[] args) {
        String str = "  My word count of a     string       method is     created.   ";
//        String newSTR = str.replaceAll("\\s+"," ");
//        System.out.println(newSTR);
        System.out.println(str.trim());
        System.out.println(countingWordsOfString1(str));
    }


    static int countingWordsOfString1(String str){
        int countOfWords =1;
        str=str.trim();
        //String str = "My word count of a string        method is created.      ";
        //if String has extra space between the words, does not effect to counting exact of words,
        //but if extra space after word, end of the String, it causes problem and we need to use strim() method
        for (int i=0; i<str.length();i++){
                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
                    countOfWords++;
        }

        return countOfWords;
    }

    static int countingWordsOfString2(String str){
        str = str.trim();

        int countOfWords = Arrays.asList(str.replaceAll("\\s+"," ").split(" ")).size();

        //String str = "My word count of a string        method is created.      ";
        //if String has extra space end of the string, does not effect to counting exact of words,
        //but if extra space come between the words, it causes problem and we need to use str.replaceAll("\\s+"," ")  method
        // and if, there are extra spaces at the beginning, we also need to use strim() along with str.replaceAll("\\s+"," ")
       // int countOfWords = Arrays.asList(str.replaceAll("\\s+"," ").trim().split(" ")).size();



        return countOfWords;
    }
}
