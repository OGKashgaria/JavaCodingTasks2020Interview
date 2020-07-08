package com.Interview.InterviewTasksMuhtar.Numbers;

public class Add_A_Number_To_A_Specific_Position {

    public static void main(String[] args){
        int[] arr= {1,2,5,9,10,20,50,100,999};
        int addThisNum = 99;
        int addingPosition = 5;
        System.out.println(addNumber_To_Specific_Position(arr,addThisNum,addingPosition));
    }


    static int[] addNumber_To_Specific_Position(int[] arr, int num, int position) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == position)
                newArr[i] += num;
            else newArr[i] = arr[j+1];
            j++;
        }
        return newArr;

    }
}
