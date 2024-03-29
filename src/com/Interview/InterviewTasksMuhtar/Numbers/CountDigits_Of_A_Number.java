package com.Interview.InterviewTasksMuhtar.Numbers;

public class CountDigits_Of_A_Number {
    public static void main(String[] args) {
        int num = -569885;
        System.out.println(countDigits_of_Numbers1(num));
        System.out.println(countDigits_of_Numbers2(num));
    }


    //Solution 1
    static int countDigits_of_Numbers1(int num){
        int count=0;

        while(num != 0){
            num = num/10;
            count++;
        }
        return count;
    }

    //Solution 2
    static int countDigits_of_Numbers2(int num){
        int count;
        if(num>0)
            count = String.valueOf(num).length();
        else
            count = String.valueOf(num).length() - 1;// "-" also counted as a character in string

       //int count = String.valueOf(num).length();
        return count;
    }
}
