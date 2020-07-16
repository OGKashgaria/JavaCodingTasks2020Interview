package com.Interview.InterviewTasksMuhtar.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Each_Words_Of_A_String {
    public static void main(String[] args) {
        String str = " Welcome to my Java Programming practice";

        System.out.println(reverseEachWord_OfString5(str));
    }



    static String reverseEachWord_OfString1(String str){
        String reversedString ="";
        String arr[] = str.split(" ");
        for( String each : arr) {
            reversedString += new StringBuilder(each).reverse().toString() + " ";
        }

        return reversedString;
    }

    static String reverseEachWord_OfString2(String str){
        String reversedString ="";
        List<String> splitList = new ArrayList<>(Arrays.asList(str.split(" ")));
        for (String each : splitList)
            reversedString += new StringBuilder(each).reverse().toString() + " ";

        return reversedString;
    }

    static String reverseEachWord_OfString3(String str){
        String reversedString ="";
        String arr[] = str.split(" ");
        List<String> reserveList = new ArrayList<>();

        for( String each : arr) {
            reserveList.add(new StringBuilder(each).reverse().toString());
        }
        for (String each : reserveList)
            reversedString += each + " ";

        return reversedString;
    }
    static String reverseEachWord_OfString4(String str){
        String reversedString ="";
        String arr[] = str.split(" ");
        String[] reversedArr = new String[arr.length];;
        int i=0;
        for( String each : arr) {
            reversedArr[i] = new StringBuilder(each).reverse().toString();
            i++;
        }

        reversedString = Arrays.toString(reversedArr)
                .replace("[","")
                .replace(",","")
                .replace("]","") +".";
        return reversedString;
    }

    static String reverseEachWord_OfString5(String str){

        String arr[] = str.split(" ");
        String reversedString ="";
        for( String each : arr) {
            String reversedWord ="";
            for (int i=each.length()-1;i>=0; i--){
                reversedWord +=  each.charAt(i);
                //reversedWord = reversedWord +  each.charAt(i);
            }
            reversedString += reversedWord + " ";
           // reversedString = reversedString + reversedWord + " ";
        }

        return reversedString;
    }
}
