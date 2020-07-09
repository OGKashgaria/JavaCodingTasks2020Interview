package com.Interview.PrimeNumberTasks;

import java.util.HashMap;

public class PrimeNumber_With_Map {
    static HashMap<Integer, String> primeNum_With_Map;

    public static void main(String[] args) {
        int num = -30;
        primeNum_With_Map(num).forEach((k, v) -> System.out.println(k + " " + v));

    }

    static HashMap<Integer, String> primeNum_With_Map(int num) {
        primeNum_With_Map = new HashMap<Integer, String>();
        int i = 2;
        //commented code belongs to here

        if (num <= 1) {
            while (num <= 1) {
                primeNum_With_Map.put(num, " is NOT a prime number.");
                num++;
            }
        } else {
            while (i <= num) {

                if (i == 2) {
                    primeNum_With_Map.put(i, " is a prime number.");
                } else {
                    if (i % i == 0 && i % 2 != 0)
                        primeNum_With_Map.put(i, " is a prime number.");
                    else
                        primeNum_With_Map.put(i, " is NOT a prime number.");
                }
                i++;
            }
        }

        return primeNum_With_Map;
    }
}
//        while(i<=num){
//            if (i <= 1)
//                primeNum_With_Map.put(i, "Num is NOT a prime number.");
//            else if (i==2){
//                primeNum_With_Map.put(i, "Num is a prime number.");
//            }
//            else {
//                    if (i % i == 0 && i % 2 != 0)
//                        primeNum_With_Map.put(i, "Num is a prime number.");
//                    else
//                        primeNum_With_Map.put(i, "Num is NOT a prime number.");
//            }
//            i++;
//        }