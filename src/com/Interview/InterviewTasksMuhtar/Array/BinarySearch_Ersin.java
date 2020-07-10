package com.Interview.InterviewTasksMuhtar.Array;

import java.util.Arrays;

/*
Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
A simple approach is to do linear search.The time complexity of above algorithm is O(n).
Another approach to perform the same task is using Binary Search.

Binary Search: Search a sorted array by repeatedly dividing the search interval in half.
Begin with an interval covering the whole array.
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.


*/
public class BinarySearch_Ersin {


    // find out if a key x exists in the sorted array A
    // or not using binary search algorithm
    public static int binarySearch(int[] A, int x) {
        // search space is A[left..right]
        int left = 0, right = A.length - 1;

        // till search space consists of at-least one element
        while (left <= right) {
            // we find the mid value in the search space and
            // compares it with key value

            int mid = (left + right) / 2;

            // overflow can happen. Use:
            // int mid = left + (right - left) / 2;
            // int mid = right - (right - left) / 2;

            // key value is found
            if (x == A[mid]) {
                return mid;
            }

            // discard all elements in the right search space
            // including the mid element
            else if (x < A[mid]) {
                right = mid - 1;
            }

            // discard all elements in the left search space
            // including the mid element
            else {
                left = mid + 1;
            }
        }

        // x doesn't exist in the array
        return -1;
    }

    public static void main(String[] args) {
       // int[] A = {2, 5, 6, 8, 9, 10};
        int[] A = {1, 2, 5, 8, 9, 10, 20, 80, 9, 0, 100, 90, 30, 55, 22, 87, 88, 22, 33, 22, 1, 2, 3};

       // Before sorted: [1, 2, 5, 8, 9, 10, 20, 80, 9, 0, 100, 90, 30, 55, 22, 87, 88, 22, 33, 22, 1, 2, 3]
       // After sorted: [0, 1, 1, 2, 2, 3, 5, 8, 9, 9, 10, 20, 22, 22, 22, 30, 33, 55, 80, 87, 88, 90, 100]

        System.out.println("Before sorted: " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("After sorted: " + Arrays.toString(A));
        int key = 2;

        int index = binarySearch(A, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }

}
