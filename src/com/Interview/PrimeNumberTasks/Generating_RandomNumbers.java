package com.Interview.PrimeNumberTasks;

import java.util.Random;

public class Generating_RandomNumbers {

    //Approach 1  using Random Class from java.util package
    public static void main(String[] args) {
        Random rand = new Random();
        int randIntNum=  rand.nextInt(10);//
        double randD= rand.nextDouble();


        //Approach 2  using Math Class from java.util package
        double randDecimals = Math.random();


        //Approach 3  using Apache commons-lang API
        //http://commons.apache.org/
        //download jar

    }
}
