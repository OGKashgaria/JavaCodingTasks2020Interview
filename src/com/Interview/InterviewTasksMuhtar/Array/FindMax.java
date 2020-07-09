package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

public class FindMax {
    /*
    Array -- Find Maximum
    Write a method that can find the maximum number from an int Array
     */
    public static void main(String[] args) {

    }


   // Solution 1:

    public static int maxValue1( int[]  n ) {

        int max = Integer.MIN_VALUE;

        for(int each: n)

            if(each > max)

                max = each;
        return max;

    }



   // Solution 2:

    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ n.length-1 ];

    }
}
