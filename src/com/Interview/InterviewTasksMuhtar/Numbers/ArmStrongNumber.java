package com.Interview.InterviewTasksMuhtar.Numbers;

public class ArmStrongNumber {
    /*
    Numbers -- Armstrong numbers
    Write a method that can check if a number is Armstrong  number
     */
    public static void main(String[] args) {

    }
   // Solution:

    public  static  boolean ArmStrongNumber (int  num) {

        int a = 0,    b =0,    c= num;

        while(num>0){

            a=num%10;

            num/=10;

            b=b+(a*a*a);

        }



        if(c==b) {

            return true;

        }

        return false;

    }
}
