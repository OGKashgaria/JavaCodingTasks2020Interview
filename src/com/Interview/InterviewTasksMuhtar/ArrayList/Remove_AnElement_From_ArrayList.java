package com.Interview.InterviewTasksMuhtar.ArrayList;

import java.util.*;

public class Remove_AnElement_From_ArrayList {
    /*
     ArrayList -- Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */
    public static void main(String[] args) {



        String[] arr = {"Ahmed", "John", "Eric", "Ahmed"};


       // System.out.println(names);


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

    // Solution 1:
    static ArrayList<String> removeAnElement(String arr) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));
        LinkedHashSet<String> setList = new LinkedHashSet<>(Arrays.asList(arr));

        names.removeAll(Arrays.asList("Ahmed"));

        return names;
    }

}