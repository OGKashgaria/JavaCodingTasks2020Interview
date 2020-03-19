package com.Interview.InterviewTasksMuhtar.String;

public class Reverse {
    /*
        String -- Reverse
    Write a return method that can reverse  String

    Ex: Reverse("ABCD"); ==> DCBA

     */
    public static void main(String[] args) {

    }

   // Solution 1

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--)

            reverse += str.toCharArray()[i];



        return  reverse;

    }

    //Solution 2

    public  static String  Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }
}
