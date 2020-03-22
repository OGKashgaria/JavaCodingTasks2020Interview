package com.Interview.InterviewTasksMuhtar.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SameLetters {
    /*
String -- Same letters
Write a return method that check if a string is build out of the same letters as another string.

Ex:  same("abc",  "cab"); -> true

same("abc",  "abb"); -> false:
 */
    public static void main(String[] args) {

        System.out.println(same2("oghlan", "nalgho"));

    }


    //Solution 1:

    public static boolean same1(String a, String b) {

        char[] ch1 = a.toCharArray();
        //by using toCharArray() method to convert given string to char[] array
        char[] ch2 = b.toCharArray();
        //by using toCharArray() method to convert given string to char[] array

        Arrays.sort(ch1);
        //sorted arrays
        Arrays.sort(ch2);
        //sorted arrays

        String a1 = "", a2 = "";
        //created two empty string to store array as a string

        for (char each : ch1)
            //used for each loop
            a1 += each;
        //took the each of array elements, then added to string a1


        for (char each : ch2)
        //used for each loop
            a2 += each;
        //took the each of array elements, then added to string a1

        return a1.equals(a2);

    }


    //Solution 2:

    public static boolean same2(String str1, String str2) {
//        TreeSet implements the SortedSet interface so duplicate values are not allowed.
//        Objects in a TreeSet are stored in a sorted and ascending order.
//        TreeSet does not preserve the insertion order of elements
//        but elements are sorted by keys.
//        TreeSet does not allow to insert Heterogeneous objects.
//        It will throw classCastException at Runtime if trying to add hetrogeneous objects.
//        TreeSet serves as an excellent choice for storing large amounts
//        of sorted information which are supposed to be accessed quickly
//        because of its faster access and retrieval time.
//        TreeSet is basically implementation of a self-balancing
//        binary search tree like Red-Black Tree. Therefore operations like add,
//        remove and search take O(Log n) time. And operations like printing n elements
//        in sorted order takes O(n) time.

        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();

        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

//        str1 = new HashSet<String>(Arrays.asList(str1.split(""))).toString();
//
//        str2 = new HashSet<String>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);

//        Constructors of TreeSet class:
//
//        TreeSet t = new TreeSet();
//        This will create empty TreeSet object in which elements
//        will get stored in default natural sorting order.

//           TreeSet t = new TreeSet(Comparator comp);
//        This constructor is used when external specification
//        of sorting order of elements is needed.

//            TreeSet t = new TreeSet(Collection col);
//        This constructor is used when any conversion is
//        needed from any Collection object to TreeSet object.

//             TreeSet t = new TreeSet(SortedSet s);
//        This constructor is used to convert SortedSet object to TreeSet Object.

    }


    //donnot make this complicate

//    public static boolean same3(String a, String b) {
//
//        char[] ch1 = a.toCharArray();
//        //by using toCharArray() method to convert given string to char[] array
//        char[] ch2 = b.toCharArray();
//        //by using toCharArray() method to convert given string to char[] array
//
//        Arrays.sort(ch1);
//        //sorted arrays
//        Arrays.sort(ch2);
//        //sorted arrays
//
//        String a1 = "", a2 = "";
//        //created two empty string to store array as a string
//
//        for (char each : ch1)
//            //used for each loop
//            a1 += each;
//        //took the each of array elements, then added to string a1
//
//        for (char each : ch2)
//            //used for each loop
//            a2 += each;
//        //took the each of array elements, then added to string a1
//
//        if (a1.length() != a2.length() ) {
//            if (a1.length() > a2.length() & a1.contains(a2))
//                return true;
//
//            if (a2.length() > a1.length() & a2.contains(a1))
//                return true;
//        }
//        return a1.equals(a2);
//
//    }
}
