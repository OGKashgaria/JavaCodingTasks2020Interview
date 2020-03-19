package com.Interview.InterviewTasksMuhtar.Map;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinValue {
    /*
    Map -- Min value
    Write a method that can return the minimum value from ta map (DO NOT use sort method)

     */
    public static void main(String[] args) {

    }



    //Solution:

    public  static  int  minValue( Map<String,Integer> map  ) {

        SortedSet<Integer> sm = new TreeSet<>(map.values());

        return sm.first( );

    }
}
