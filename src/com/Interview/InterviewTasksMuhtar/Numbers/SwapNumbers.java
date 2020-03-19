package com.Interview.InterviewTasksMuhtar.Numbers;

public class SwapNumbers {
    /*
     Numbers -- Swap Numbers
    Swap two variable' values without using a third variable

     */
    public static void main(String[] args) {

        // Solution 1:

        int  a = 10;      int  b  = 20;

        a = a +b;

        b = a - b;

        a = a - b;



        // Solution 2:

        int  c = 10;      int  d  = 20;

        c = c^d;

        d = c^d;

        c = c^d;


    }






}
