package com.Interview.Collections;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FizzBuzz_Ternary_HashMap_ReturnMethod {
    public static void main(String[] args) {
        int num =30;
        map(fizzBuzz(num),num).forEach((k, v)-> System.out.println(k + " : " + v));
        //maps.forEach((k, v) -> System.out.println(k + " : " + v));
    }


    public static String fizzBuzz(int num) {

        String result = "";
        for (int i = 1; i <= num; i++) {
            result += (i % 5 == 0 && i % 3 == 0) ? "FizzBuzz \n" : (i % 5 == 0) ? "Fizz \n"
                    : (i % 3 == 0) ? "Buzz \n" : i + " \n";
        }
        return result;
    }

    static HashMap<Integer, String> map(String result, int num) {
        List<String> arrResult = Arrays.asList(result.split("\n"));
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        int i = 1;
        while (i <= num) {
            for (String each : arrResult) {
                map.put(i, each);
                i++;
            }
        }
        return map;
    }
}