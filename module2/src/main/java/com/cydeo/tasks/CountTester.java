package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountTester {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        List<Double> cd=Arrays.asList(1.8, 2.9, 3.0, 4.5);
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

    private static <T> int countIf(List<T> list,UnaryPredicate<T> obj){ // we want this method to work for odd or even predicates

       int count=0;
       for(T each: list){
           if(obj.test(each)){// test is overridden in classes which implements UnaryPredicate
               ++count;
           }
       }
       return count;
    }
}
