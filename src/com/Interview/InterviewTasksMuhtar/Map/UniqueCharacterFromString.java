package com.Interview.InterviewTasksMuhtar.Map;

import java.util.*;

public class UniqueCharacterFromString {
    public static void main(String[] args) {
        String str = "accabbcd";
        uniqueCharactersFromString(str);

    }
    static void uniqueCharactersFromString(String str){

        Map<Character, Integer> unique = new HashMap<>();

        for( int j = 0; j < str.length(); j++) {
            int count =0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == str.charAt(j))
                    count++;
            }
            if( count == 1){
                unique.put(str.charAt(j), count);
            }
        }

        System.out.println(unique);

    }


}
