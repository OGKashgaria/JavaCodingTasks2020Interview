package com.Interview.InterviewTasksMuhtar.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveAhmed {
    /*
     ArrayList -- Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {


        // Solution 1:

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));

                names.removeAll( Arrays.asList("Ahmed"));



        System.out.println(names);


//
//    Solution 2:
//
//    List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));
//
//for(ListIterator<String> it=names.listIterator(); it.hasNext();)
//
//            if(it.next().equals("Ahmed"))
//
//            it.remove();
//
//
//
//System.out.println(names);

//    Solution 3:
//
//    List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));
//
//            List<String> names2 = new ArrayList<>();
//
//    names.forEach(p-> {if(p.equals("Ahmed")) names2.add(p);}  );
//
//
//
//System.out.println(names2);


//    Solution 4:
//
//    List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".));
//
//            Iterator<String> it = names.iterator();
//
//    while(it.hasNext()) {
//
//        if(it.next().equals("Ahmed"))
//
//            it.remove();
//
//    }
//
//    System.out.println( names );

    }

}