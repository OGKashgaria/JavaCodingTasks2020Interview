package com.Interview.InterviewTasksMuhtar.Numbers;

import java.util.Arrays;

public class FINRA {
    /*
    Numbers -- FINRA
    Write a method which prints out the numbers from 1 to 30
    but for numbers which are a multiple of 3,
    print "FIN" instead of the number and for numbers
    which are a multiple of 5, print "RA"
    instead of the number.
    for numbers which are a multiple of both 3 and 5,
    print "FINRA" instead of the number.


     */
    public static void main(String[] args) {

    }


   // Solution 1:

    public static void FINRA1() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            if(i % 5==0 && i %3 ==0)

                result += "FINRA ";

            else if(i%5 == 0)

                result += "RA ";

            else if(i%3==0)

                result+="FIN ";

            else

                result += i+" ";

        }

        System.out.println(result);

    }



    //Solution 2:

    public static void FINRA2() {

        String result = "";

        for(int i=1; i <= 30; i++) {

            result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA "

                    :(i%3 == 0) ? "FIN " : i+" ";

        }

        System.out.println(result);

    }



   // Solution 3:

    public static void FINRA3(int num) {

        //created a empty string array, size with num
        String[] myArr= new String[num];
        //created a for loop to store the num to myArr by loop through as list of strings
        for( int i=0; i <= num-1; i++ )
            //i started with 0, because array's index starts with 0
            myArr[i] = ""+(i+1);
        // (i+1) is an integer, by concatenating with empty string, converted to string

        //with another for loop,retrieving array elements from array, like, myArr[j]
        //Integer.valueOf(myArr[j]), then using Integer.valueOf() method, converting string to integer
        for(int j=0; j<myArr.length; j++)

            if(Integer.valueOf(myArr[j])%3==0 && Integer.valueOf(myArr[j]) %5==0)
                //replace the value of myArr[j] to "FINRA"
                myArr[j]="FINRA";

            else if (Integer.valueOf(myArr[j])%3==0)
                //replace the value of myArr[j] to "FIN"
                myArr[j]="FIN";

            else if (Integer.valueOf(myArr[j])%5==0)
                //replace the value of myArr[j] to "RA"
                myArr[j]="RA";



            //Arrays.toString(myArr) --> converts myArr to String
        System.out.println(Arrays.toString(myArr));

    }

}
