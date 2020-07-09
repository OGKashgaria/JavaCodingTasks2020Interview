package com.Interview.InterviewTasksMuhtar.Numbers;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverseInteger1(-125));

    }
    // actually this works for positive and negative numbers
    static int reverseInteger1(int num){
        int revNum = 0;
        while(num != 0){
            revNum = revNum*10 + num%10;
            num = num/10;
        }

        return revNum;
    }

    //reverse any natural numbers
    static int reverseInteger2(int num){
      String revNum = new StringBuilder(""+num).reverse().toString();
      if (num>=0)
          return Integer.valueOf(revNum);
      else
          // str = "-"+str.substring(0, str.length()-1);
          revNum = "-" + revNum.replace("-","");
          return Integer.valueOf(revNum);

    }

    static int reverseInteger3(int num){
        String revNum = new StringBuilder(String.valueOf(num)).reverse().toString();
        if (num>=0)
            return Integer.valueOf(revNum);
        else
            // str = "-"+str.substring(0, str.length()-1);
            revNum = "-" + revNum.replace("-","");
        return Integer.valueOf(revNum);

    }


}
