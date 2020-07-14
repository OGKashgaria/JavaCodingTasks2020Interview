package com.Interview.InterviewTasksMuhtar.Array;

import java.util.*;
import java.util.stream.Collectors;
/*
 requirement is: there is an array,
 which is without sorted and with duplicates.
created a method which can accept int[],
 and after ordered and removed duplicates, return it as an int[]...
 */

public class SortAnArray_and_RemoveDups {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 4, 5, 9, 0, 0, 8, 2};

        Integer[] arr2 = {1, 2, 4, 5, 9, 0, 0, 8, 2};

        int b = 10;

        Integer a = b;
        Integer d =9;

        int c = d;

        System.out.println(Arrays.toString(orderingAnArrayAndRemovingDups2(arr2)));
    }

    static int[] orderingAnArrayAndRemovingDups1(int[] arr) {

        TreeSet<Integer> set = new TreeSet();
        for (Integer each : arr) {
            set.add(each);
        }

        int[] newArr = new int[set.size()];
        int i = 0;
        for (Integer each : set) {
            newArr[i] += each;
            i++;
        }
        return newArr;
    }
    static Integer[] orderingAnArrayAndRemovingDups2(Integer[] arr2) {

        TreeSet<Integer> set = new TreeSet(Arrays.asList(arr2));

        Integer[] newArr = new Integer[set.size()];
       set.toArray(newArr);
        return newArr;
    }

     static int[] orderingAnArrayAndRemovingDups3(int[] array) {
        int[] tmpArr = java.util.stream
                .IntStream
                .of(array)
                .distinct()
                .toArray();
        Arrays.sort(tmpArr);
        return tmpArr;
    }


    static int[] orderingAnArrayAndRemovingDups4(int[] arr) {
        return
                new ArrayList<>(
                        Arrays
                                .stream(arr)       // Generating a stream of the `int` values held in the array.
                                .boxed()           // Auto-boxing `int` primitives to `Integer` objects.
                                .collect( Collectors.toCollection(TreeSet::new) )
                        // Passing the `Integer` objects into a `TreeSet` to (a) eliminate duplicates,
                        // and (b) sort them.
                )
                        .stream()
                        .mapToInt(i -> i)
                        .toArray();
    }

    static Object[] orderingAnArrayAndRemovingDups5(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                int v = map.get(arr[i]);
                map.put(arr[i], v + 1);
            }
        }
        Set<Integer> integers = new TreeSet<>();
        for (Map.Entry<Integer, Integer> me : map.entrySet()) {
            if (me.getValue() > 1)
                integers.add(me.getKey());

        }

        return integers.toArray();
    }
}
