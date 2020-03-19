package com.Interview.InterviewTasksMuhtar.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

//Write a return method that can find the frequency of characters
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class FrequencyOfChar {
    public static void main(String[] args) {

        System.out.println(FrequencyOfChars2("AAABBCDD"));
    }

    //solution1:
    public static String FrequencyOfChars1(String str) {
        String nonDup = "";
        // created a string empty variable to store nonDuplicated chars by loop through
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))
                //if nonDup doesn't contain str.charAt(i)
                nonDup+= ""+str.charAt(i);
            //add the ' ""+str.charAt(i) ' to the nonDup string
        String expectedResult = "";
        //created a Empty String to store charAt(j) character from nonDup String
        //and times of occurrence in String str next to it
        for( int j=0;j < nonDup.length(); j++) {
            //outer loop catch charAt(index of nonDup)
            int count = 0;
            // create integer to count occurrence of every single char element of nonDup string
            // after comparing with every single element of String str
            // by nested loop through
            for(int i=0; i < str.length(); i++) {
                //inner loop(catch chatAt index of str)
                if(str.charAt(i) == nonDup.charAt(j))
                    // if str.charAt(i) occurred each time, add its occurrence time to count
                    count++;
            }
            expectedResult +=nonDup.charAt(j)+"" + count;
            // expectedResult = nonDup.charAt(j) and it's occurrence in String str
            //nonDup.charAt(j)+"" --> by adding empty string we can convert char to string
        }
        return expectedResult;
    }

    //solution 2:
    public  static  String  FrequencyOfChars2(String str) {
        String expectedResult = "";
        int j=0;
        //Created integer j to catch index of String str, started from 0
        while( j < str.length()) {
            //while outer loop standing at the index(or charAt(j))
            int count = 0;
            //Created integer i, also to catch index of String str, started from 0
            for(int i=0; i < str.length(); i++) {
                //inner loop takes each character of str (or str.charAt(i)) and do comparision with charAt(j)
                //for example: while outer loop str.charAt(j=0), inner loop str.charAt(i) go through all the way to end
                // till i < str.length() falls
                if(str.charAt(i) == str.charAt(j)) {
                    //then counts occurrence of each element
                    count++;
                    //then increase counts according to occurrence time
                }
            }
            expectedResult +=str.charAt(j)+"" + count;
          //  str = str.replace(""+str.charAt(j) ,  "" );
        }
        return expectedResult;
    }

   // Solution 3:

    public  static  String  FrequencyOfChars3(String str) {
        String b=new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ","").replace("[","").replace("]","");
        String result="";
        for(int j=0; j<b.length();j++) {
            int times=0;
            for(int i=0; i<str.length(); i++)
                if(str.substring(i, i+1).equals(""+str.charAt(j)))
                    times++;
            result+=b.substring(j, j+1)+times;
        }
        return result;
    }

    //Solutions 4:
    public static String frequency4(String str) {
        String nonDup="", result="";
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                nonDup += ""+str.charAt(i);
        for(int i=0; i < nonDup.length(); i++) {
            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
            result += ""+nonDup.charAt(i) + num;
        }
        return result;
    }







}
