package com.Interview.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Examples {
    static int num = 30;
    static String[] arr;
    static HashMap<Integer, String> map, maps;

    public static void main(String[] args) {
        maps = map1(arr(num));
       // printMapWithForEach(maps);
       // printMapWith_Iterator(maps);
        printMapWith_forEachMethod(maps);

    }
    static String[] arr(int num) {
        arr = new String[num];
        int i = 0;
        while (i < num) {
            arr[i] = "abc" + (i + 1);
            i++;
        }
//        for (int i=0; i<30;i++){
//            arr[i] = "abc" + (i+1);
//        }
        return arr;
    }

    //Using for-each loop
    static HashMap map1(String[] arr) {
        map = new HashMap<>();
        int i = 1;
        for (String each : arr){
            map.put(i, each);
            i++;
        }
        return map;
    }

    static void printMapWithForEach(HashMap<Integer, String> maps){

        for (Map.Entry eachK_V : maps.entrySet()){
            System.out.println(eachK_V.getKey() + " : " + eachK_V.getValue());
        }
    }


    //Using an Iterator:
    static void printMapWith_Iterator(HashMap<Integer, String> maps){

        Iterator mapIterator = maps.entrySet().iterator();

        while (mapIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) mapIterator.next();
            System.out.println(mapElement.getKey() + " : " + mapElement.getValue());
        }
    }

    //Using forEach() method: forEach() is a method of hashmap which is introduced in java 8.
    // It is used to iterate through the hashmap and also reduces the number of lines of code.
    static void printMapWith_forEachMethod(HashMap<Integer, String> maps){
        maps.forEach((k, v) -> System.out.println(k + " : " + v));
    }

}
