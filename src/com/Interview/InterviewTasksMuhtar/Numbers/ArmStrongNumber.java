package com.Interview.InterviewTasksMuhtar.Numbers;

public class ArmStrongNumber {
    /*
    Numbers -- Armstrong numbers
    Write a method that can check if a number is Armstrong  number
     */
    public static void main(String[] args) {
        System.out.println(armStrongNumber(153));

    }

    public static boolean armStrongNumber(int num) {

        int sum = 0,
                rem, //remainder
                temp;//temporary
        temp = num;//temp created to keep original num without changing

        while (num > 0) {//temp =153 -->temp =15 --> temp =1
            rem = num % 10;//rem = 3 -->rem = 5 -->rem = 1
            num = num / 10;// num = 15--> num = 1 --> num = 0
            sum = sum + (rem * rem * rem);//sum =27 -->sum =27 +(5*5*5) -->sum =(27 +(5*5*5)) +(1*1*1)
        }
//        System.out.println(num);// num is 0
//        System.out.println(temp);
//        System.out.println(sum);
        if (sum == temp) {
            return true;
        }
        return false;
    }
}
