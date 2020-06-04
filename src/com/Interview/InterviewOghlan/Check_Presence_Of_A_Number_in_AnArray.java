package com.Interview.InterviewOghlan;

public class Check_Presence_Of_A_Number_in_AnArray {
    /*
    The aim of this exercise is to check the presence of a number in an array.
    Specification:
                    the items are integers arranged in ascending order
                    the array can contain up to 1 million items
                    the array is never null

              implement the method boolean A.exists( int[] ints, int k);
              so that it returns true if k belongs to ints, otherwise method should return false.

         important note: Try to save CPU cycles if possible

         Example:
                int[] ints = {-9, 0, 10,20,30};

                A.exists(ints, 10) returns true;
                A.exists(ints, 50) returns false;

     */


    // i have bugs in this code

    static boolean exists1(int[] ints, int k) {
        boolean exist = false;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == k) return !exist;
        }
        return exist;
    }

    static boolean exists(int[] ints, int k) {
        for (int each : ints){
            if(each == k) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] ints = {-9, 0, 10, 20, 30};
        System.out.println(exists1(ints, 0));


    }
}
