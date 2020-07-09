package com.Interview.InterviewTasksMuhtar.Numbers;

public class PrimeNumber {
    /*
    Numbers -- Prime Number
        Write a method that can check if a number is prime or not
     */
    public static void main(String[] args) {
        int num = 30,i=-5;
        while(i<=30){
            System.out.println(i + " : " +primeNumber(i));
            i++;
        }




    }
    //Solution:

    public static boolean primeNumber(int num) {

        boolean result = false;




            for (int i = 1; i <= num; i++) {
                if (num <= 1) {

                    return result;

                }
                else if (num == 2) {
                    return !result;
                }


                else if (num % i == 0 && num % 2 != 0) {

                    return true;

                }

            }

        return result;
    }


}
