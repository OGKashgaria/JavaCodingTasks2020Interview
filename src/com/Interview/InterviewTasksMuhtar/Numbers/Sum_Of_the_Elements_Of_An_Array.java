package com.Interview.InterviewTasksMuhtar.Numbers;

public class Sum_Of_the_Elements_Of_An_Array {


    //Solution 1 with for-each loop
    static long sumOf_An_Array1(int[] intArr){
        long sum=0;
        for (int each : intArr)
            sum += each;
        return sum;
    }

    //Solution 2 with for loop //or Enhanced for loop
    static long sumOf_An_Array2(int[] intArr){
        long sum=0;
        for (int i=0;i<intArr.length-1;i++)
            sum += intArr[i];
        return sum;
    }

    //Solution 2 Enhanced for loop
    static long sumOf_An_Array3(int[] intArr){
        long sum=0;
        for (int i=0;i<intArr.length-1;i++)
            sum += intArr[i];
        return sum;
    }
}
