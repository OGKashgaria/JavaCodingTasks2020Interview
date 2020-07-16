package com.Interview.InterviewTasksMuhtar.Array;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindDupsFromArray {
    static ArrayList<String> dupList;

    public static void main(String[] args) {
        //String[] arr = {"java", "Selenium","abc","Cucumber","Cucumber","cucumber","java","abc"};
        String[] arr = {"java", "Selenium", "abc", "cucumber", "java", "abc"};
        //String[] arr = {"java", "Selenium"};
        //int[] arr = {1, 2, 3, 4, 5};

        if (checkExistenceOfDupElementsOfArray12(arr))
            System.out.println("Existence Of Dup Elements: " + checkExistenceOfDupElementsOfArray12(arr));
        else
            System.out.println("Existence Of Dup Elements: " + checkExistenceOfDupElementsOfArray12(arr));

       // System.out.println(checkExistenceOfDupElementsOfArray2(arr));

//        dupList = checkExistenceOfDupElementsOfArray4(arr);
//        for (String each : dupList)
//            System.out.println("DupList from arrayList: " + each);

    }

    //Solution 1
    static boolean checkExistenceOfDupElementsOfArray1(int[] arr) {
        boolean isExist = false;
        int i,j;
        for ( i=0; i < arr.length; i++) {

            for (j=i+1; j < arr.length; j++) {// not comparing by it self
                //if (arr[i].equalsIgnoreCase(arr[i]))
                if (arr[i]==arr[j])
                    isExist = true;
            }
        }
        return isExist;
    }
    //Solution 1
    static boolean checkExistenceOfDupElementsOfArray12(String[] arr) {
        boolean isExist = false;
        int i,j;
        for ( i=0; i < arr.length; i++) {

            for (j=i+1; j < arr.length; j++) {// not comparing by it self
                //if (arr[i].equalsIgnoreCase(arr[i]))
                if (arr[i]==arr[j])
                    isExist = true;
            }
        }
        return isExist;
    }
    static boolean checkExistenceOfDupElementsOfArray13(int[] arr) {
        boolean isExist = false;

        for (int j = 0; j < arr.length; j++) {
        //in this method, it is comparing by it self,so, count should be more then one

            int count = 0;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == arr[j])
                    count++;

            if (count != 1)
                isExist = true;
        }
        return isExist;
    }

        //Solution 2
        static boolean checkExistenceOfDupElementsOfArray2 (String[] arr){
            boolean isExist = false;
            HashSet<String> setDups = new HashSet<>();

            for (String each : arr) {
                if (setDups.add(each) == false) {
                    isExist = true;
                }
            }
            return isExist;
        }

        //Solution 2 returning a string of dupElements
        static String checkExistenceOfDupElementsOfArray3 (String[]arr){

            //ArrayList<String> dupList = new ArrayList<>();
            String dupArr = "";
            HashSet<String> setDups = new HashSet<>();

            for (String each : arr) {
                setDups.add(each);
                if (setDups.add(each) == false) {
                    dupArr = " " + each;
                }
            }

            return dupArr;
        }

        static ArrayList<String> checkExistenceOfDupElementsOfArray4 (String[]arr){

            dupList = new ArrayList<>();

            LinkedHashSet<String> setDups = new LinkedHashSet<>();


            for (String each : arr) {
                if (setDups.add(each.toLowerCase()) == false) {// at this line unique of array elements already added to HashSet
                    dupList.add(each);// if if there are dup elements, setDups.add(each) this gonna be false and if statement runs
                    // then  dupList.add(each); will adds dup elements to arrayList
                }
                //System.out.println("Check successfully added or not to HashSet: " + setDups.add(each));//this should be all false
            }
            System.out.println("After added to HashSet(only unique elements were added): " + setDups);

            return dupList;
        }

    }

