package com.Interview.InterviewTasksMuhtar.Numbers;

public class DivideWithoutOperator {
    /*
      Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator

     */
    public static void main(String[] args) {

    }



   // Solution:

    public static void devides(int num1, int num2) {

        if(num2==0) {

            System.out.println("Invalid Number");

            return;

        }

        System.out.print(num1 +" devid by "+num2 +" is: ");

        int count =0;

        while(num1 >= num2) {

            num1 -= num2;

            count++;

        }

        System.out.println(count+" and remainder is "+num1);

    }
}
