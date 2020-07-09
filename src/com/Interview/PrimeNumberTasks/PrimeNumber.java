package com.Interview.PrimeNumberTasks;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        // System.out.println(primeNum(num));
        System.out.println(findPrimes(num));

    }

    static boolean primeNum(int num) {
        //boolean isPrime = true;
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2)
                return true;
            else
                return false;
        } else
            return false;
    }

    public static ArrayList<Integer> findPrimes(int num) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int j = 1; j <= num; j++) {
            int count1 = 0;
            int i = 1;
            while (i <= j) {
                if (j % i == 0) {
                    count1++;
                }
                i++;
            }
            if (count1 == 2)
                primes.add(num);

        }
        return primes;
    }


}
