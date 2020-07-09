package com.Interview.InterviewTasksMuhtar.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindDupsFromArray {
    public static void main(String[] args) {
        String[] arr = {"java", "Selenium","abc","Cucumber","Cucumber","cucumber","java","abc"};
        System.out.println(checkExistenceOfDupElementsOfArray3(arr));
    }

    //Solution 1
    static boolean checkExistenceOfDupElementsOfArray(String[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    flag=true;
            }
        }
        return flag;
    }

    //Solution 2
    static boolean checkExistenceOfDupElementsOfArray2(String[] arr) {
        boolean flag = false;
        String dupArr = "";
        HashSet<String> setDups = new HashSet<>();

        for (String each : arr) {
            setDups.add(each);
            if (setDups.add(each)==false){
                flag = true;
            }
        }
        return flag;
    }

    //Solution 2 returning a string of dupElements
    static String checkExistenceOfDupElementsOfArray3(String[] arr) {

        //ArrayList<String> dupList = new ArrayList<>();
        String dupArr = "";
        HashSet<String> setDups = new HashSet<>();

        for (String each : arr) {
            setDups.add(each);
            if (setDups.add(each)==false){
                dupArr = " " + each;
            }
        }

        return dupArr;
    }
}
