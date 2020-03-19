package com.Interview.InterviewTasksMuhtar.String;

public class SumOfDigitsInAString {
    /*
    String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */
    public static void main(String[] args) {

    }




  //  Solution:

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
