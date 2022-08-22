package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
    List<Integer> number= Arrays.asList(2,4,2,10,23);
    //empty() - isPresent()

        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());

       // we are making number optional so that it won't throw exception
        System.out.println( Optional.of(number).isPresent());

        // ifPresent Optional protects from NULL POINTER EXCEPTION
        Optional<Integer> bigNumber=number.stream().filter(x->x>100).findAny();
        System.out.println(bigNumber);
        System.out.println("***********");
        bigNumber.ifPresent(System.out::println); // condition is false it does not print ifPresent prints
       // System.out.println(bigNumber.get()); throws exception

        System.out.println("***********");
        System.out.println(bigNumber.orElse(5));// else prints 5

    }
}
