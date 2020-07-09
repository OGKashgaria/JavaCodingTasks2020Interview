package com.Interview.PrimeNumberTasks;

import java.util.ArrayList;
import java.util.Enumeration;

public class PrimeNumber_ArrayList {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        System.out.println(findPrimes(start,end));


    }

    public static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime)
                primes.add(num);
        }
        return primes;
    }
}
