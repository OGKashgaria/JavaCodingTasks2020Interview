package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {

    }

    //Solution 1:

    public static int maxValue1( int[]  n ) {

        int min = Integer.MAX_VALUE;

        for(int each: n)

            if(each < min)

                min = each;



        return min;

    }



    //Solution 2:

    public static int maxValue2( int[]  n ) {

        Arrays.sort( n );

        return  n [ 0 ];

    }
}
