package com.Interview.InterviewTasksMuhtar.Numbers;

public class Even_and_Odd_DigitsOf_a_Number {

    public static void main(String[] args) {
        int num = 1546698753;
        even_and_Odd_DigitsOf_a_Number(num);
    }

    static void even_and_Odd_DigitsOf_a_Number(int num){
        int oddCount =0, evenCount =0;

        int digit;
        while (num != 0){
            digit = num%10;

            if (digit%2 ==0)
                evenCount++;
            else
                oddCount++;

            num = num/10;
        }
        System.out.println("Even numbers count is: " + evenCount);
        System.out.println("Odd numbers count is: " + oddCount);

    }
}
