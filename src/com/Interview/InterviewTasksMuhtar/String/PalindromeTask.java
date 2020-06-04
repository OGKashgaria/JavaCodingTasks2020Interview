package com.Interview.InterviewTasksMuhtar.String;

public class PalindromeTask {

    static String palindromeString(String str) {
        // Pointers pointing to the beginning
        // and the end of the string
        String result = "";
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
       // level
            if (str.charAt(i) == str.charAt(j)) {
                result += "" + str.charAt(i);

            }
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }
        for(i=0; i<str.length();i++ ) {
            for(j = str.length() - 1; j>=i;j-- ) {

                // If there is a mismatch
                if (str.charAt(i) == str.charAt(j)) {
                    result += "" + str.charAt(i);

                }
                // Increment first pointer and
                // decrement the other
                i++;
                j--;
            }
        }


        // Given string is a palindrome
        return result;
    }

    public static void main(String[] args) {
        String str = palindromeString("level");

        System.out.println(str);
    }
}

