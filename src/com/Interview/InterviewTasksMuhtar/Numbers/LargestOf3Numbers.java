package com.Interview.InterviewTasksMuhtar.Numbers;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        int num1= 20;
        int num2=10;
        int num3=10;
        System.out.println(largestNum1(num1,num2,num3));
    }

    static String largestNum1(int num1,int num2,int num3){
        String largestNum="";

        if(num1 != num2 && num1 != num3 && num2 != num3) {
            if (num1 > num2 && num1 > num3)
                largestNum ="The largest number is: " + num1;
            if (num2 > num1 && num2 > num3)
                largestNum ="The largest number is: " +  num2;
            if (num3 > num1 && num3 > num2)
                largestNum ="The largest number is: " +  num3;
        }
        else if(num1 != num2 && num1 == num3) {
            if (num1 > num2)
                largestNum ="The largest number is: " +  num1 + " and "+ "num1: " + num1 + " = " + "num3: " + num3;
            if (num2 > num1)
                largestNum = "The largest number is: " +  num2 + " and "+ "num1: " + num1 + " = " + "num3: " + num3;;
        }
        else if(num1 == num2 && num1 != num3) {
            if (num1 > num3)
                largestNum = "The largest number is: " +  num1 + " and "+ "num1: " + num1 + " = " + "num2: " + num2;
            if (num3 > num1)
                largestNum = "The largest number is: " +  num3 + " and "+ "num1: " + num1 + " = " + "num2: " + num2;
        }
        else if(num1 != num2 && num2 == num3) {
            if (num1 > num2)
                largestNum = "The largest number is: " +  num1 + " and "+ "num2: " + num2 + " = " + "num3: " + num3;;
            if (num2 > num1)
                largestNum = "The largest number is: " +  num2 + " and "+ "num2: " + num2 + " = " + "num3: " + num3;
        }
        else
            largestNum = "The largest number is: " +  num1 + " and all three numbers are equal.";

        return largestNum;
    }

    static int largestNum2(int num1,int num2,int num3){

        int largestNum=num1>num2?num1:num2;
        largestNum = num3>largestNum?num3:largestNum;




        return largestNum;
    }


}
