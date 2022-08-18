package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.Comparator.*;

import static java.util.Comparator.comparing; // important to know

public class AppleDemo {
    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<>(Arrays.asList(new Apple(250,Color.RED),
                new Apple(100,Color.GREEN),new Apple(300,Color.GREEN),new Apple(50,Color.GREEN)));
        System.out.println(inventory);

      //  Comparator<Apple> sortApples= comparing((Apple apple)->apple.getWeight());
      //  inventory.sort(sortApples);



     //   Comparator<Apple> sortApples2=comparing(Apple::getWeight);// class name :: instance method
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        // reverse the list - chain the methods
        inventory.sort(comparing(Apple::getWeight).reversed()); // reverse the inventory

// first sort by weight then sort by color
        inventory.sort(comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(inventory);
    }
}
