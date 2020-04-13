package com.Interview.ImportantReviews;

public class FinallyKeyword {
    public static void main(String[] args) {
     //   finallyKeyword();
        test();

        System.gc();


    }

    public static void finallyKeyword(){
        try{
            System.out.println("inside finallyKeyword method");
            throw new RuntimeException("throw exception here");
        }catch (Exception e){
            System.out.println("inside catch block");
        }

        finally {
            //always use with try catch block ,
            System.out.println("\n------------- finally Block ---------------");
            System.out.println("inside finally block");
            System.out.println("this finally block runs whether try catch block throws exception or not");
        }
    }

    static void test(){
        System.out.println("\n------------- without catch bloch, only try and finally Block ---------------");
        try{
            System.out.println("inside test method");

        }
        finally{
            System.out.println("inside catch block");
        }

    }






}
