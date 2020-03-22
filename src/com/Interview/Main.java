package com.Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    //"AAABBCDD"

    public static void main(String[] args) {
	// write your code here

        //FrequencyOfChars3("AAABBCDD");
        /*
        you are creating a new String from LinkedHashset.
        Actually since LinkedHashset accepts only Array,
        first you split str into pieces to convert to Array
        and initialize it to the new b String.
         at the end you convert it again to String.
         */
        String str = "AAABBCDD";
        System.out.println(FrequencyOfChars3(str));


//        char[] ch= str.toCharArray();
//        for (int i=0; i< ch.length; i++)
//            System.out.print(ch[i] +" " );


//        String b =new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
//        System.out.println(b);
//        b = b.replace(", ","").replace("[","").replace("]","");
//        System.out.println(b);
//
//        b = b.replace(",","").replace("[","").replace("]","");
//        System.out.println(b + "\n ------------");
//        b = b.replace(",","").replace("[","").replace("]","").stripLeading();
//        System.out.println(b);






    }
    public  static  String  FrequencyOfChars3(String str) {
        //Any set implementations Not allowed duplicates
        System.out.println(str.split(""));

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
}
