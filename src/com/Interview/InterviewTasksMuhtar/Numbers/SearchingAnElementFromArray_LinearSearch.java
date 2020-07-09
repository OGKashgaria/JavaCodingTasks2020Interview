package com.Interview.InterviewTasksMuhtar.Numbers;

public class SearchingAnElementFromArray_LinearSearch {
    public static void main(String[] args) {
        int[] arr= {1,2,5,8,9,10,20,80,9,0,100,90,30,55,22,87,88,22,33,22,1,2,3};
        int searching_Element =101;

        System.out.println("Element is exist: " + linearSearching(arr,searching_Element));

    }

    static boolean linearSearching(int[] arr, int searching_Element){

        boolean isExist = false;
        int count =0;// to count how many of that elements are exist in the array
        for (int i=0; i<arr.length; i++){
            if (searching_Element == arr[i]) {
                isExist = true;
                count++;
                System.out.println("Element exist at the index of: " + i);
            }


        }
        System.out.println("Element is exist: "+ count +" times in this array.");
        return isExist;

    }
}
