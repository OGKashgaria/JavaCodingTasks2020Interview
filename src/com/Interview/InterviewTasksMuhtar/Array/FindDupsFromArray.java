package com.Interview.InterviewTasksMuhtar.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDupsFromArray {
    static ArrayList<String> dupList;
    public static void main(String[] args) {
        //String[] arr = {"java", "Selenium","abc","Cucumber","Cucumber","cucumber","java","abc"};
        String[] arr = {"java", "Selenium","abc","cucumber","java","abc"};
        //System.out.println(checkExistenceOfDupElementsOfArray1(arr));

        dupList = checkExistenceOfDupElementsOfArray4(arr);
        for (String each : dupList)
            System.out.println(each);

    }

    //Solution 1
    static boolean checkExistenceOfDupElementsOfArray1(String[] arr) {
        boolean flag = false;
        int i =0;
        for ( i = 0; i < arr.length; i++) {
            for (i= i+1; i < arr.length; i++) {
                if (arr[i] == arr[i])
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

    static ArrayList<String> checkExistenceOfDupElementsOfArray4(String[] arr) {

            dupList = new ArrayList<>();
        //String dupArr = "";
        LinkedHashSet<String> setDups = new LinkedHashSet<>();


        for (String each : arr) {
            setDups.add(each);
            System.out.println(setDups.add(each));
//            if (setDups.add(each)==false){
//                dupList.add(each);
//            }
        }
        System.out.println(setDups);

        return dupList;
    }
}
