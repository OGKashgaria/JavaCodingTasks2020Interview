package com.Interview.InterviewTasksMuhtar.String;

import java.util.Arrays;
import java.util.List;

public class PalindromeTask {

    static String palindromeString1(String originString) {
        originString = originString.toLowerCase();// If String is "Level" , make it lower case
        String result = "", reserveResult = "";
        int i = 0, j = originString.length() - 1;
        while (i <= j) {
            if (originString.charAt(i) == originString.charAt(j)) {
                result += "" + originString.charAt(i);
            }
            i++;
            j--;
        }
        if (originString.length() % 2 == 0) {//"originString.length()%2==0", the method is to check : "levvel or level";
            for (int k = result.length() - 1; k >= 0; k--) {
                reserveResult += "" + result.charAt(k);
            }
        }
        else {
            for (int k = result.length() - 2; k >= 0; k--) {
                reserveResult += "" + result.charAt(k);
            }
        }
        // Given string is a palindrome
        return result + reserveResult;
    }


    static String palindromeString2(String originString) {
        if (originString == null)
            return "is a empty string!";
        StringBuilder stringBuilder = new StringBuilder(originString);
        return stringBuilder.reverse().toString();
    }

    static String palindromeString3(String originString) {
        String result = "";
        //if originString is a word without space
       // List<String> arrOriginString = Arrays.asList(originString.split(""));

        //in case the originString is a word wit space, like, "kayak level civic"
        List<String> arrOriginString = Arrays.asList(originString.trim().split(""));
        for (int i=arrOriginString.size() - 1; i>=0 ; i--) {
            result += "" + arrOriginString.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String originString = "civic level civic";
        //String palindromeString = palindromeString1(originString);
        //String palindromeString = palindromeString2(originString);
        String palindromeString = palindromeString3(originString);

        if (palindromeString.equalsIgnoreCase(originString))
            System.out.println(true);
        else System.out.println(false);

        System.out.println("Origin String is: " + originString + ";");
        System.out.println("After checking is palindrome or not, the String is: " + palindromeString + ";");
    }


}

