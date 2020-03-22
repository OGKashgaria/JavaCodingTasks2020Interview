package com.Interview.InterviewTasksMuhtar.StringUsfulMethods;

public class ConvertingString_To_StringBufferBuilder {
    public static void main(String[] args) {
        String str = "Geeks";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        System.out.println("\n--------StringBuffer----------\n" + sbr);

        sbr.reverse();
        System.out.println("\n--------StringBuffer reversed:---------\n" + sbr);

        // conversion from String object to StringBuilder
        StringBuilder sbl = new StringBuilder(str);
        System.out.println("\n--------StringBuilder----------\n" + sbl);
        sbl.reverse();
        System.out.println("\n--------StringBuilder reversed:---------\n" + sbl);
//        sbl.append("ForGeeks");
//        System.out.println(sbl);
    }
}

