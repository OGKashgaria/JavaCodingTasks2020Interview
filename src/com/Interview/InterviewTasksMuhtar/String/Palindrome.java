package com.Interview.InterviewTasksMuhtar.String;

public class Palindrome {
//    Approach: Take two pointers i pointing to the start of the string and
//    j pointing to the end of the string. Keep incrementing i and
//    decrementing j while i < j and at every step check
//    whether the characters at these pointers are same or not.
//    If not then the string is not a palindrome else it is.
//
//    Below is the implementation of the above approach:
//
//    filter_none
//            edit
//    play_arrow

    //       brightness_4
    // Java implementation of the approach


    // Function that returns true if
    // str is a palindrome
    static boolean isPalindrome1(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters toc compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }
    static boolean isPalindrome2(String str){
        if (str == null)
            return false;
        StringBuilder stringBuilder = new StringBuilder(str);
        return stringBuilder.reverse().toString().equalsIgnoreCase(str);


    }

    // Driver code
    public static void main(String[] args) {
        String str = "Level";

        if (isPalindrome2(str))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

}
