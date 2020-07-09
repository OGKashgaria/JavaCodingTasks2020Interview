package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

public class Check_Multi_Dimensional_ArraysEquals {
    public static void main(String[] args) {
        int[][] arr3 = {{1,2,3,4,5},{6,7,8,9,10}};
        int[][] arr4 = {{1,2,3,4,5},{6,7,8,9,10}};

        System.out.println(checkMultiDimensionalArraysEquals(arr3,arr4));
    }

    static boolean checkMultiDimensionalArraysEquals(int[][] arr3, int[][] arr4){

        return Arrays.deepEquals(arr3,arr4);
    }
}
