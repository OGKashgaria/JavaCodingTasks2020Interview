package com.Interview.InterviewTasksMuhtar.String;

public class Reverse_Each_Words_Of_A_String {
    public static void main(String[] args) {
        String str = " Welcome to my Java Programming practice";

        System.out.println(reverseEachWord_OfString(str));
    }



    static String reverseEachWord_OfString(String str){
        String reversedString ="";
        String arr[] = str.split(" ");
        String[] reversedArr = new String[arr.length];;
        int i=0;
        for( String each : arr) {
//            reversedArr[i] += new StringBuilder(each).reverse().toString();
//            i++;
            reversedString += new StringBuilder(each).reverse().toString() + " ";
        }




        return reversedString;
    }
}
