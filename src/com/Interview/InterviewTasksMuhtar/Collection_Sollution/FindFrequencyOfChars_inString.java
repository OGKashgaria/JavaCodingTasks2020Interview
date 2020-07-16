package com.Interview.InterviewTasksMuhtar.Collection_Sollution;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FindFrequencyOfChars_inString {

    public static void main(String[] args) {

    }
    // Solution 3:
    public  static  String  FrequencyOfChars3(String str) {

        String b =new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
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

        //"aabbbccDDD"
        String nonDup="", result="";
        //remove duplicates first, and store it to new string  nonDup
        for(int i=0; i < str.length(); i++)
            if(! nonDup.contains(""+str.charAt(i)))
                //if nonDup does not contain str.charAt(i) element, add it to nonDup by loop through
                nonDup += ""+str.charAt(i);//"abcD"
        for(int i=0; i < nonDup.length(); i++) {
            //loop through nonDup string
            int num = Collections.frequency( Arrays.asList(str.split("") ) ,    ""+nonDup.charAt( i ) );
            // use Collections.frequency(), and count its occurrence in the original string str
            result += ""+nonDup.charAt(i) + num;
            //then add nonDup.charAt(i) to result string with adding its occurrence times next to it
        }
        return result;
    }
}
