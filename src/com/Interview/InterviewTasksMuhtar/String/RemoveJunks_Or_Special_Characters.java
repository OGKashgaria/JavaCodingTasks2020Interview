package com.Interview.InterviewTasksMuhtar.String;

public class RemoveJunks_Or_Special_Characters {
    //use regular expression
    public static void main(String[] args) {
        String str = "!@## latinNNO 1223548";
        System.out.println(str);
        //Regular Expression: [^a-zA-Z0-9]
        str = str.replaceAll("[^a-zA-Z0-9 ]","");//saved space
        System.out.println(str);

        String str1 = "/***//==- latinNNO 1223548";
        str1 = str1.replaceAll("[^a-zA-Z0-9]","");//removed space also
        System.out.println(str1);
    }
}
