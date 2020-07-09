package com.Interview.InterviewTasksMuhtar.String;

import org.w3c.dom.ls.LSOutput;

public class SwampingTwoStrings {


    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Kashgaria";




        System.out.println("Before swamping the String 'str1' and 'str2' : ");
        System.out.println("String str1 is: " + str1);
        System.out.println("String str2 is: " + str2);
//
//        //way1 by using substring
//        //step1
//        str1 = str1 + str2;
//        //step2
//        str2 = str1.substring(0, str1.length() - str2.length());
//        //step3
//        str1 = str1.substring(str2.length());

        //way2 by using replace method
        //step1
        str1 = str1 + str2;
        //step2
        str2 = str1.replace(str2,"");
        //step3
        str1 = str1.replace(str2,"");


        System.out.println("After swamping the String 'str1' and 'str2' : ");
        System.out.println("String str1 is: " + str1);
        System.out.println("String str2 is: " + str2);

    }
}
