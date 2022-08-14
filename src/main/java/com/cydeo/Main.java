package com.cydeo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList items=new ArrayList(); // arraylist is a class so I can create an object from this class
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add("Apple");// ArrayList can accept any kind of objects but in the method we are casting it to Integer type
        printDoubled(items);
    }

    private static void printDoubled(ArrayList items) {
        for(Object each: items){ // collection type is an object items hold objects
            System.out.println((Integer)each*2); // cast to integer type to operate


        }
    }
}
