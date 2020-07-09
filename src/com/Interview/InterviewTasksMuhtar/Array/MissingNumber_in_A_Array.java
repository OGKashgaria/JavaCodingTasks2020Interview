package com.Interview.InterviewTasksMuhtar.Array;

public class MissingNumber_in_A_Array {

    public static void main(String[] args) {
        //assume the array is sorted in ascending order
        int[] arr= {1,2,3,5};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr){
        int sum1=0, sum2=0, i=0, j=0,missingNum ;

        for(i=0; i<arr.length;i++){
            sum1 += arr[i];
        }

        for (j=0; j<=arr[arr.length-1];j++){
            sum2 += j;
        }
        missingNum = sum2 -sum1;

        return missingNum;
    }
}
/*
public static void main(String[] args) {
        int[] arr= {1,2,3,5};
        int sum1=0;
        for(int i=0; i<arr.length;i++){
            sum1 += arr[i];
        }
        System.out.println(sum1);

        int sum2 =0;
        for (int j=0; j<=arr[arr.length-1];j++){
            sum2 += j;
        }
        System.out.println(sum2);
        int missingNum = sum2 -sum1;
        System.out.println(missingNum);
    }
 */
