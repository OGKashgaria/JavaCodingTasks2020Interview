package com.Interview.InterviewTasksMuhtar.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatTwoArrays {
    /*
      Array -- Concat two arrays
    Write a return method that can concate two arrays
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        Integer[] arr3 = {1,2,3,4,5};
        Integer[] arr4 = {6,7,8,9,10};

        //System.out.println(Arrays.toString(concatTwoArrays1(arr1, arr2)));
        //System.out.println(Arrays.toString(concatTwoArrays2(arr3, arr4)));

        //System.out.println(Arrays.toString(concatTwoArrays4(arr3, arr4)));

        System.out.println(Arrays.toString(concatTwoArrays5(arr1, arr2)));

    }

    //Solution:1
     static int[] concatTwoArrays1(int[] arr1 , int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for(int each: arr1) {
            result[i] = each;
            i++;
        }
        for(int each: arr2) {
            result[i] =each;
            i++;
        }
        return result;
    }

    //Solution:2
    static Integer[] concatTwoArrays2(Integer[] arr3 , Integer[] arr4) {
        Integer[] result =new Integer[0];
        List<Integer> newArr = new ArrayList<>(Arrays.asList(arr3));
        newArr.addAll(Arrays.asList(arr4));
        //result = newArr.toArray(new Integer[0]);
        result = newArr.toArray(result);
        return result;
    }

    //Solution:3
    static Object[] concatTwoArrays3(Integer[] arr3 , Integer[] arr4) {
        Object[] result;
        List<Integer> newArr = new ArrayList<>(Arrays.asList(arr3));
        newArr.addAll(Arrays.asList(arr4));
        result =  newArr.toArray();
        return result;
    }

    //Solution:4
    static <Integer> Object[] concatTwoArrays4(Integer[] arr3 , Integer[] arr4) {
        Object[] newArr = Stream.of(arr3,arr4).flatMap(Stream::of).toArray();
        return newArr;
    }

    //Solution:5
    static int[] concatTwoArrays5(int[] arr1 , int[] arr2) {
        int[] newArr = new int[arr1.length+ arr2.length];
        System.arraycopy(arr1,0, newArr,0, arr1.length);
        System.arraycopy(arr2,0, newArr, arr1.length, arr2.length);
        return newArr;
    }
}
/*
import java.util.*;
public class MergeArrayExample4
{
public static void main(String args[])
{
String str1[] = { "A", "E", "I" };          //source array
String str2[] = { "O", "U" };               //destination array
List list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array
//returns a list view of str2 and adds all elements of str2 into list
list.addAll(Arrays.asList(str2));
Object[] str3 = list.toArray();         //converting list to array
System.out.println(Arrays.toString(str3));  //prints the resultant array
}
}
 */
