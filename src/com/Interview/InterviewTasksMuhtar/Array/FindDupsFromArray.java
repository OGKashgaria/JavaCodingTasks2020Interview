package com.Interview.InterviewTasksMuhtar.Array;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDupsFromArray {
    static ArrayList<String> dupList;
    public static void main(String[] args) {
        String[] arr = {"java", "Selenium","abc","Cucumber","Cucumber","cucumber","java","abc"};
        //String[] arr = {"java", "Selenium","abc","cucumber","java","abc"};
        //System.out.println(checkExistenceOfDupElementsOfArray1(arr));

        dupList = checkExistenceOfDupElementsOfArray4(arr);
        for (String each : dupList)
            System.out.println("DupList from arrayList: " + each);

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
//            if (setDups.add(each)==false) {
//                dupList.add(each);
//            }
//            }

            if (setDups.add(each.toLowerCase())==false){// at this line unique of array elements already added to HashSet
                dupList.add(each);// if if there are dup elements, setDups.add(each) this gonna be false and if statement runs
                // then  dupList.add(each); will adds dup elements to arrayList
            }
            //System.out.println("Check successfully added or not to HashSet: " + setDups.add(each));//this should be all false
        }
        System.out.println("After added to HashSet(only unique elements were added): "+ setDups);

        return dupList;
    }
}
