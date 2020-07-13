package com.Interview.InterviewTasksMuhtar;

import java.util.Arrays;
import java.util.TreeSet;

public class TestClass {

    public static void main(String[] args) {
        int[] arr2 = {1, 2, 4, 5, 9, 0, 0, 8, 2};

        System.out.println(Arrays.toString(removingDups(arr2)));
    }

    // requirement is: there is an array, which is without sorted and with duplicates.
    //created a method which can accept int[], and after ordered and removed duplicates, return it as an int[]...
    static int[] removingDups(int[] arr) {

        TreeSet<Integer> set = new TreeSet();
        for (Integer each : arr) {
            set.add(each);
        }
        System.out.println(set);

        int[] newArr = new int[set.size()];

            int i = 0;
            for (Integer each : set) {
                newArr[i] += each;
                i++;
            }

        return newArr;
    }


}
