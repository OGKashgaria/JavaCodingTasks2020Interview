package com.Interview.InterviewTasksMuhtar.StringUsfulMethods;

public class Converting_StringBufferOrStringBuilder_To_StringBuilderOrStringBuffer {
    public static void main(String[] args)
    {
        StringBuffer sbr = new StringBuffer("Geeks");

        // conversion from StringBuffer object to StringBuilder
        String str = sbr.toString();
        StringBuilder sbl = new StringBuilder(str);

        System.out.println(sbl);

    }
}
