//package com.JavaStreams;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Main {
//    public static void main(String[] args) {
//        //map: The map method is used to returns a stream consisting of the results of
//        // applying the given function to the elements of this stream.
//        List number = Arrays.asList(2,3,4,5);
//        List square = number.stream().map(x->x*x).collect(Collectors.toList());
//
//        //filter: The filter method is used to select elements as per the Predicate passed as argument.
//                List names = Arrays.asList("Reflection","Collection","Stream");
//        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//
//
//       // sorted: The sorted method is used to sort the stream.
//                List names = Arrays.asList("Reflection","Collection","Stream");
//        List result = names.stream().sorted().collect(Collectors.toList());
//
//
//
//    }
//}
