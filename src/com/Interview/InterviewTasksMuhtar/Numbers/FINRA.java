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

    public static void FINRA3() {

        String[] myarr= new String[30];



        for( int i=0; i <= 29; i++ )

            myarr[i] = ""+(i+1);



        for(int j=0; j<myarr.length; j++)

            if(Integer.valueOf(myarr[j])%3==0 && new Integer(myarr[j])%5==0)

                myarr[j]="FINRA";

            else if (Integer.valueOf(myarr[j])%3==0)

                myarr[j]="FIN";

            else if (Integer.valueOf(myarr[j])%5==0)

                myarr[j]="RA";



        System.out.println(Arrays.toString(myarr));

    }

}
