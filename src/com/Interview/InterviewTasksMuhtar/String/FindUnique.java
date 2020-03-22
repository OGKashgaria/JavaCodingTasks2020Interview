package com.Interview.InterviewTasksMuhtar.String;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    /*
     Write a return  method that can find the unique characters from the String

    Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));

    }

    //Solution 1:
    //created a method with return type is string, and parameter is string
    public static String unique(String str) {
<<<<<<< HEAD
    //created a empty string array to store char characters after split
        String[] arr=str.split("");
    // create a empty string to store unique characters
        String unique1="";
    //created a nested loop to check each of character with others of array
        //loop through following by index order
        //out loop takes it first character, takes index 0
        //inner index takes start from first characters to the last
        // then will compare with first character
        for(int j=0; j<arr.length; j++) {
        //created an int num to count occurrence time of each character
=======
        String[ ] arr=str.split("");
        String unique1="";
        for(int j=0; j<arr.length; j++) {
>>>>>>> origin/master
            int num=0;

            for(int i=0; i<arr.length; i++ ) {
                // if character of array at arr[i] equals to character of array at arr[j]
                if(arr[i].equals(arr[j]) )
                //increase the num by one each time
                    num++;

            }
            // if a character's occurrence equal to 1
            // because we also compare that character by itself, its occurrence equal to 1
            if(num==1)
            // then char of array at arr[j] add to unique1 empty string
                unique1+=arr[j];

        }
        // then return unique1
        return unique1;

    }

    //Solution 2:

    public static String unique2(String str) {

        String result ="";

        for(String each : str.split(""))
            //used for each loop, created temperary variable each
            //each takes every single character's of str.split("")

            result += ( (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
        //Arrays.asList(str.split("")) --> split the string str, then stored it to an array as a list
        //(Collections.frequency(Arrays.asList(str.split("")), each) compares each character with elements of arrays
        // then counts
        //if (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 , means if occurs only one time
        // add it to the result , else return empty string



        return result;

    }
}
