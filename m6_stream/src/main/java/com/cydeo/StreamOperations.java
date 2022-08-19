package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        // Filter and Distinct
        System.out.println("===Filter===");
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5,6,4,2,6,6);
        list.stream()
                .filter(i -> i % 2 == 0) // Predicate functional interface accepts integer returns boolean
                .forEach(System.out::print);
        System.out.println();
        System.out.println("===Distinct===");

        Stream<Integer> str=list.stream()
                .filter(i->i%2==0)
                .distinct();// shows the unique elements in the stream -eliminates repeated numbers
        str.forEach(System.out::print); // terminal operator closes the stream
        System.out.println();
        System.out.println("===Truncate: Limit and Skip===");

        list.stream()
                .filter(i->i%2==0)
                //.limit(1) // shows the first one 2
                .limit(2) // shows the first two 2 and 4
                .skip(1) // skips the first one which is 2 in this case
                .forEach(System.out::println);

        System.out.println();

        list.stream()
                .filter(i->i%2!=0)
                .skip(1) // skips the first odd number and prints the others
                .forEach(System.out::print);

        System.out.println();
        System.out.println("===Mapping===");

        list.stream()
                .map(i->i*5) // taking action on each object and manipulate the object
                .filter(i->i%3==0)
                .distinct()
                .forEach(System.out::println);
    }
}