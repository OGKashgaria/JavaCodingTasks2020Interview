package com.Interview.InterviewTasksMuhtar.Numbers;

public class FactorialNumber {
    /*
    Write a return method that returns the factorial number of any given number

    Ex:

    Input: 5

    outPut: 120

    2! = 2 * 1 = 2
    3! = 3 * 2 * 1 =6
    4! = 4 * 3 * 2 * 1 = 24
     */
    public static void main(String[] args) {
        System.out.println(factorialNumber1(5));

    }

    //Solution:
    public static int factorialNumber(int n){
        int i, fact = 1;
        for( i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    static int factorialNumber1(int facNum){
        //factorial number of 1 is 1
        //so, if facNum ==1, return 1
      if(facNum == 1)
          return 1;
      //else, for example, assume facNum = 5; factorial number of 5 ie:
      // 5! = 5 * 4 * 3 * 2 * 1
      //or 5! = 5 * 4! (4! = 4 * 3!)....
      //so, factorialNumber1(facNum - 1) here we recalled factorialNumber1() again and again, util facNum = 1 .
      else return facNum * factorialNumber1(facNum - 1);
    }



}
