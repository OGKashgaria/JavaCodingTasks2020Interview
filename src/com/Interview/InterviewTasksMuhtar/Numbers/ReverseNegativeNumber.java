package com.Interview.InterviewTasksMuhtar.Numbers;

public class ReverseNegativeNumber {
    /*
       Number -- Reverse negative number
    Write a return method that can reverse negative number and return it as int
     */
    public static void main(String[] args) {
        System.out.println(reverseNum(-521));

    }

    public static int reverseNum(int  num) {

        String str = new StringBuilder(""+num).reverse().toString();
        System.out.println(str);

        if(num < 0) {

           // str = "-"+str.substring(0, str.length()-1);
            // str.length()-1 is the index if "-", it will be exclusive when we use str.substring(0, str.length()-1)
            str ="-"+ str.replace("-","");
            // at this point, we can replace "-" with empty string, then concat "-" to front
            //System.out.println(str);

        }

        return Integer.valueOf(str);

    }
}
