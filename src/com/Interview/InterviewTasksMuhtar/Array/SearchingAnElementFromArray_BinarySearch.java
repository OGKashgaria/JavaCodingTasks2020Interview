package com.Interview.InterviewTasksMuhtar.Array;

import java.util.*;

public class SearchingAnElementFromArray_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 10, 20, 80, 9, 0, 100, 90, 30, 55, 22, 87, 88, 22, 33, 22, 1, 2, 3};
        //int searching_Element = 101;
        //Arrays.sort(arr);
        // System.out.println(binarySearching(arr, searching_Element));

        removingDups5(arr);
        System.out.println();
    }

    static boolean binarySearching(int[] arr, int searching_Element) {
        boolean isExist = false;
        int leftBoundary = 0, rightBoundary = arr.length - 1;
        Arrays.sort(arr);

        while (leftBoundary <= rightBoundary) {
            int midElementIndex = (leftBoundary + rightBoundary) / 2;
            //so, middle element is: arr[midElementIndex]
            if (searching_Element == arr[midElementIndex]) {
                isExist = true;
                System.out.println("Element exist at the index of: " + midElementIndex);
                break;
            } else if (searching_Element > arr[midElementIndex])
                leftBoundary = midElementIndex + 1;
            else //(searching_Element < arr[midElementIndex]) else should be, does not accept condition
                rightBoundary = midElementIndex - 1;
        }

        return isExist;
    }


    //Solution  returning a string of dupElements
    static void removingDups(int[] arr) {

//        LinkedHashSet setDups = new LinkedHashSet(Arrays.asList(arr));
//        for (int each : arr) {
//            setDups.add(String.valueOf(each));
//        }
//        System.out.println(setDups);
////        int[] newArr = new int[setDups.size()];
////        int i=0;
////        for (String each : setDups) {
////            newArr[i] = (int) each;
////            i++;
////        }
//
//        LinkedHashSet<Integer> setDups = new LinkedHashSet(Arrays.asList(arr));
//        for (int each : arr) {
//            setDups.add(each);
//        }
//        System.out.println(setDups);
//
//        int[] newArr = new int[setDups.size()];
//        int i = 0;
//        while (i < setDups.size()) {
//
//            for (Integer each : setDups) {
//                newArr[i] += (int) each;
//                i++;
//            }
//            System.out.println(newArr);
//
//        }
    }

    static void removingDups4(int[] arr) {

        TreeSet set = new TreeSet(Arrays.asList(arr));
        System.out.println(set);

//        int[] newArr = new int[set.size()];
//        int i =0;
//       // newArr=  set.toArray(newArr);
//        for(Integer each : set)
//            newArr[i] += each;
//        System.out.println(Arrays.toString(newArr));

//        Integer[] newArr = new Integer[set.size()];
//       newArr= (Integer[]) set.toArray(newArr);




    }

    static void removingDups5(int[] arr) {

        TreeSet set = new TreeSet();
        System.out.println(set);
        for (int each : arr)
            set.add(each);


        Integer[] newArr = new Integer[set.size()];
        int i=0;
        for (Object each : set) {
            newArr[i] += (Integer) each;
        }
        System.out.println(Arrays.toString(newArr));

//        int[] newArr = new int[set.size()];
//        int i =0;
//       // newArr=  set.toArray(newArr);
//        for(Integer each : set)
//            newArr[i] += each;
//        System.out.println(Arrays.toString(newArr));

//        Integer[] newArr = new Integer[set.size()];
//       newArr= (Integer[]) set.toArray(newArr);




    }
}