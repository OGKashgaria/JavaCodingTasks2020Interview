package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

public class BubbleSorting_Of_Array {
    public static void main(String[] args) {
        int[] arr= {1,2,5,8,9,10,20,80,9,0,100,90,30,55,22,87,88,22,33,22,1,2,3};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        System.out.println("======================After Sorting==============");
        System.out.println("Array after sorting: " + Arrays.toString(bubbleSorting(arr)));
    }

    static int[] bubbleSorting(int[] arr){
        int arrLength = arr.length;
        for (int i=0; i<arrLength-1; i++){// number of pass
            for (int j=0; j<arrLength -1; j++){// iterator

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
