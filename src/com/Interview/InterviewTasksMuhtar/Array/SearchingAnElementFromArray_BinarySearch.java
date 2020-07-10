package com.Interview.InterviewTasksMuhtar.Array;

import java.util.*;
public class SearchingAnElementFromArray_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 10, 20, 80, 9, 0, 100, 90, 30, 55, 22, 87, 88, 22, 33, 22, 1, 2, 3};
        int searching_Element = 101;
        Arrays.sort(arr);
        System.out.println(binarySearching(arr,searching_Element));
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
            }
            else if (searching_Element > arr[midElementIndex] )
                leftBoundary = midElementIndex + 1;
            else //(searching_Element < arr[midElementIndex]) else should be, does not accept condition
                rightBoundary = midElementIndex - 1;
        }

        return isExist;
    }

}

//    //Solution  returning a string of dupElements
//    static Set<Integer> removingDups(Integer[] arr) {
//
//        LinkedHashSet<Integer> setDups = new LinkedHashSet<Integer>(Arrays.asList(arr));
//        for (Integer each : arr) {
//            setDups.add(each);
//        }
//        return setDups;
//    }