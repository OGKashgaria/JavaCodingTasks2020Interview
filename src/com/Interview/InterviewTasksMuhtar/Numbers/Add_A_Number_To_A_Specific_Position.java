package com.Interview.InterviewTasksMuhtar.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add_A_Number_To_A_Specific_Position {

    public static void main(String[] args){
        Integer[] arr= {1,2,5,9,10,20,50,100,999};
        int addThisNum = 99;
        int addingPosition = 5;
        System.out.println(Arrays.toString(addNumber_To_Specific_Position2(arr, addThisNum, addingPosition)));
    }


    static int[] addNumber_To_Specific_Position1(int[] arr, int num, int position) {
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < position -1)
                newArr[i] += arr[i];
            else if (i == position -1)
            newArr[i] += num;
            else
                newArr[i] +=arr[i - 1];

        }
        return newArr;

    }

    private static Integer[] addNumber_To_Specific_Position2(Integer[] arr, int element, int position) {
        // Coverting array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Adding the element at position
        list.add(position - 1, element);

        // Converting the list back to array
        arr = list.toArray(arr);
        return arr;
    }
}
//// Printing the original array
//        System.out.println("Initial Array:\n"
//                + Arrays.toString(arr));
//
//                // Printing the updated array
//                System.out.println("\nArray with " + element
//                + " inserted at position "
//                + position + ":\n"
//                + Arrays.toString(arr));