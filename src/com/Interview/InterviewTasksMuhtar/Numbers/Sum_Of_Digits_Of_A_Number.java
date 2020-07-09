package com.Interview.InterviewTasksMuhtar.Numbers;

import java.util.Arrays;

public class Sum_Of_Digits_Of_A_Number {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println(addingDigits_Of_Numbers1(num));
    }


    //Solution 1
    static int addingDigits_Of_Numbers1(int num){
        int sumOfDigits =0;

        while(num != 0){
            sumOfDigits = sumOfDigits + num%10;
            num = num/10;
        }

        return sumOfDigits;
    }
}
