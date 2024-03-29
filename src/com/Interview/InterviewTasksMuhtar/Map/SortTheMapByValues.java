package com.Interview.InterviewTasksMuhtar.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortTheMapByValues {
    /*
     Map -- Sort the map by values
    Write a method that can sort the Map by values
     */
    public static void main(String[] args) {

    }




    //Solution:

    public static Map<String, Integer> sortByValue(Map<String, Integer> map){

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap();

        for(Map.Entry<String, Integer> each : list) {

            map.put(each.getKey(), each.getValue());

        }

        return map;

    }
}
