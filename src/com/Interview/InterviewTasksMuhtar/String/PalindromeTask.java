package com.Interview.InterviewTasksMuhtar.String;

public class PalindromeTask {

    static String palindromeString(String originString) {
        // Pointers pointing to the beginning
        // and the end of the string
         originString =originString.toLowerCase();// If String is "Level" , make it lower case
        String result = "", reserveResult ="";
        int i = 0, j = originString.length() - 1;
        // While there are characters toc compare
        while (i <= j) {

            // If there is a mismatch
       // level
            if (originString.charAt(i) == originString.charAt(j)) {
                result += "" + originString.charAt(i);

            }
            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        if (originString.length()%2==0) {
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

    public static void main(String[] args) {
        String originString= "Levvel";
        String palindromeString = palindromeString(originString);

        if(palindromeString.equalsIgnoreCase(originString))
            System.out.println(true);
        else System.out.println(false);

        System.out.println( "Origin String is: " + originString + ";");
        System.out.println( "After checking is palindrome or not, the String is: " + palindromeString + ";");
    }
}

