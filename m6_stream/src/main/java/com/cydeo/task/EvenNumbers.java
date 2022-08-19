package com.cydeo.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numberList= Arrays.asList(12,4,51,89,74);
        Stream<Integer> integerStream=numberList.stream();
        integerStream
                .filter(x->x%2==0)
                .sorted()
                .forEach(System.out::println);

    }
}
