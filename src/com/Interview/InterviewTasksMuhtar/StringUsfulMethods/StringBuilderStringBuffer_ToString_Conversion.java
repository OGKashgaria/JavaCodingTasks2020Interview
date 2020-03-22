package com.Interview.InterviewTasksMuhtar.StringUsfulMethods;

public class StringBuilderStringBuffer_ToString_Conversion {
    /*
    From StringBuffer and StringBuilder to String :
    This conversions can be perform using toString()
    method which is overridden in both StringBuffer
    and StringBuilder classes.
Below is the java program to demonstrate the same.
Note that while we use toString() method,
a new String object(in Heap area)
is allocated and initialized to character sequence currently
represented by StringBuffer object, that means the subsequent
changes to the StringBuffer object
do not affect the contents of the String object.
     */

    // Java program to demonstrate conversion from
// String to StringBuffer and StringBuilder.

    public static void main(String[] args) {
        StringBuffer sbr = new StringBuffer("Oghlan");
        StringBuilder sbdr = new StringBuilder("Kashgaria");

        // conversion from StringBuffer object to String
        String str = sbr.toString();
        System.out.println("StringBuffer object to String : ");
        System.out.println(str);

        // conversion from StringBuilder object to String
        String str1 = sbdr.toString();
        System.out.println("StringBuilder object to String : ");
        System.out.println(str1);

        // changing StringBuffer object sbr
        // but String object(str) doesn't change
        sbr.append("Uyghur");
        System.out.println(sbr);
        System.out.println(str);

    }

}
