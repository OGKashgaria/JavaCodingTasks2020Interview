package com.Interview.InterviewTasksMuhtar.Numbers;

public class FibonacciNumbers {
    /*
    Numbers -- Fibonacci numbers
    Write a return method that returns the  Fibonacci of any given number
     */
    public static void main(String[] args) {

    }

   // Solution:

    public static int fib(int num){

        int result=0;
        int j=0;
        int z=1;

        for(int i=1; i<num; i++){

            result=j+z;
            j=z;
            z=result;

        }

        return result;

    }
}
