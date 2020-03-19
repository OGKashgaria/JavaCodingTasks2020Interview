package com.Interview.InterviewTasksMuhtar.Numbers;

public class PrimeNumber {
/*
Numbers -- Prime Number
    Write a method that can check if a number is prime or not
 */
    public static void main(String[] args) {

    }
    //Solution:

    public static boolean primeNumber(int num) {

        boolean result = false;

        if(num <= 1) {

            return result;

        }

        for(int i = 2; i < num; i++) {

            if(num % i == 0 ) {

                return true;

            }

        }
        return result;
    }
}
