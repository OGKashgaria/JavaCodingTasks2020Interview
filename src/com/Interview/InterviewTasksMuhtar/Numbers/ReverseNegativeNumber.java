package com.Interview.InterviewTasksMuhtar.Numbers;

public class ReverseNegativeNumber {
    /*
       Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
     */
    public static void main(String[] args) {

    }

   // Solution:

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();

        if(num < 0) {

            str = "-"+str.substring(0, str.length()-1);

        }

        return Integer.valueOf(str);

    }
}
