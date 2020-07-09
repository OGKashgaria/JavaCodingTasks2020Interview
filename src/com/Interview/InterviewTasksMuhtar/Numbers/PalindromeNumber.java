package com.Interview.InterviewTasksMuhtar.Numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 16561;
//        //Calling Solution 1
//        if(num == palindromeNum1(num))
//            System.out.println(num + " is a palindrome number");
//        else
//            System.out.println(num + " is NOT a palindrome number");

        //Calling Solution 1
        System.out.println(palindromeNum2(num));

    }


    //Solution 1
    static int palindromeNum1(int num){
       int revNum =0;
       while(num != 0){
           revNum = revNum*10 + num%10;
           num = num/10;
       }
       return revNum;
    }

    //Solution 2
    static boolean palindromeNum2(int num){
        int revNum =0;
        int orgNum = num;
        while(num != 0){
            revNum = revNum*10 + num%10;
            num = num/10;
        }
        if (revNum == orgNum)
            return true;
        else
            return false;
    }
}
