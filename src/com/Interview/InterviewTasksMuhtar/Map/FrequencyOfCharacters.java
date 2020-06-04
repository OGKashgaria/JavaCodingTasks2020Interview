package com.Interview.InterviewTasksMuhtar.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    /*
    Map -- Frequency of Characters
    Write a method that prints the frequency of each character from a String
     */
    public static void main(String[] args) {

    }

    //Solution:

    public static void FrequencyTest(String  str ) {
        //Map stores data as pair of <Key,Value>
        //Key only be unique, but value can be duplicated
        // Map is an interface, implemented by HashMap,
        // HashMap extended by LinkedHashMap (both are class)
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {

                map.put(each, map.get(each) + 1);

            } else {

                map.put(each, 1);

            }

        }

        System.out.println(map);

    }
}
