package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

public class Check_SingleDimensional_ArraysEquals {


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};


        System.out.println(checkArraysEquals2(arr1,arr2));

    }

    //Solution 1
    static boolean checkArraysEquals1(int[] arr1,int[] arr2){
        return Arrays.equals(arr1,arr2);
    }

    //Solution 2 with for-loop
    static boolean checkArraysEquals2(int[] arr1,int[] arr2){
        boolean status = true;
        if(arr1.length == arr2.length){
            for (int i=0; i<arr1.length;i++){
                if (arr1[i] != arr2[i])
                    status = false;
            }
        }
        else
            status = false;
        return status;
    }

}
