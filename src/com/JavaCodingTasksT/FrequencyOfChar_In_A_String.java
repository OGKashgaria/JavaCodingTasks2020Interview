package com.JavaCodingTasksT;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class FrequencyOfChar_In_A_String {
    public static void main(String[] args) {
        String word = "aaaaaAbbSSddDKLMANGooOOBDF";

//        Frequency_Of_Chars(word);
//        System.out.println(Frequency_Of_Chars(word));

        System.out.println(frequency3(word));

//        Map<Character, Integer> map = new LinkedHashMap<>();
//
//        for(int i=0; i < word.length(); i++){
//            if (!map.containsKey(word.charAt(i))){
//                map.put(word.charAt(i), 1);
//            }
//            else
//                map.put(word.charAt(i), map.get(word.charAt(i))+1);
//            //map.get(word.charAt(i))
//        }
//        for (Map.Entry each : map.entrySet()){
//            System.out.println("Word contains " + each.getValue() + " times "+ each.getKey() + " character");
//        }
    }


    static String Frequency_Of_Chars(String word) {
        String result = "";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (!map.containsKey(word.charAt(i))) {
                map.put(word.charAt(i), 1);
            } else
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            //map.get(word.charAt(i))
        }
        for (Map.Entry each : map.entrySet()) {
            result += "Word contains " + each.getValue() + " times " + each.getKey() + " character";
        }

//        map.forEach(k,v)->{
//            System.out.println("Word contains " + v + " times "+ k + " character");
//        };
        return result;
    }


    static String frequency3(String str) {

        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");

        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int times = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(""+ b.charAt(j)))
                    times++;
            }
            result += "" + b.charAt(j) + times;
        }


        return result;
    }

    public static String frequency4(String str) {
        return str;
    }


}


