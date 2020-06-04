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
// created a method which takes Map parameter, and returns min value
    public  static  int  minValue( Map<String,Integer> map  ) {
        //map.values() method gets the values from map parameter, then converts it
        // then stores them to SortedSet interface as Integers
        //SortedSet interface does not accept duplicates,
        //and sorts the elements in ascending order
        SortedSet<Integer> sm = new TreeSet<>(map.values());
        //use sm.first( ) to get min value from sorted set

        return sm.first( );

    }
}
