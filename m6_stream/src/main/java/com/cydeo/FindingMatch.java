package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatch {
    // All match
    public static void main(String[] args) {
        System.out.println("*******ALL MATCH******************");
       // if all dishes less than 1000 calories return true
       boolean isHealthy= DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);// condition:: we do not use it
        System.out.println(isHealthy); //

        System.out.println("**********ANY MATCH**********************");
    // if any of them is vegetarian return true;
        boolean isVegetarianOption=DishData.getAll().stream().anyMatch(Dish::isVegetarian); // isVegetarian returns boolean
        System.out.println("Is there a vegetarian option on the menu?");
        System.out.println(isVegetarianOption);

        System.out.println("*****************NONE MATCH************************");
        // if none of them is matching return true
        boolean isHealthy2=DishData.getAll().stream().noneMatch(dish->dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("*********************FIND ANY****************************");
        // findAny() returns Optional type -- Optional prevents null pointer exception
        Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());


        System.out.println("********************FIND FIRST***********************");
        Optional<Dish> firstDish=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(firstDish.get());

        // PARALLEL STREAMS (A-SYNCHRONIZED) - Reactive programming

        // OOP - Functional Programming -Reactive Programming A-Synchronized

        System.out.println(IntStream.range(0,100).parallel().findAny()); // findAny returns a any integer
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1= Arrays.asList("John","David","Moe","Derek","Julia","Lilly","Sarah","Danny","Jill");
        List<String> list2= Arrays.asList("John","David","Moe","Lilly","Sarah","Danny","Jill");
       // list1.stream().parallel()
        Optional<String> findAny=list1.parallelStream().filter(s->s.startsWith("D")).findAny();
        Optional<String> findFirst=list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        System.out.println(findAny);
        System.out.println(findFirst);
        Optional<String> findAnyJ=list1.parallelStream().filter(s->s.startsWith("J")).findAny();
        Optional<String> findFirstJ=list1.parallelStream().filter(s->s.startsWith("J")).findFirst();
        System.out.println(findAnyJ);
        System.out.println(findFirstJ);


        // MIN AND MAX

        Optional<Dish>  finMinFirstDish=DishData.getAll().stream().sorted(Comparator.comparing(Dish::getCalories)).findFirst();
        Optional<Dish> findMinDish=DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(findMinDish); // findMinDish.get()

        Optional<Dish> findMaxDish=DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(findMaxDish);


        // REDUCE takes 2 arguments return one element  - combine two elements produce single result

        List<Integer> nums=Arrays.asList(1,5,6,8);

        System.out.println(nums.stream().reduce(0,(a,b)->a+b)); // a is assigned 0 b=1, a+b=1, b=5, a+b=6, b=6, a+b=12, b=8, a+b=20

  Integer totalCal= DishData.getAll().stream().map(Dish::getCalories).reduce(0,(a,b)->a+b);
        Integer totalCal2= DishData.getAll().stream().map(Dish::getCalories).reduce(Integer::sum).get();// w/o get method it will return optional
        System.out.println(totalCal);

        // if you don't give an initial value then returns Optional
       Optional <Integer> totalCal3=DishData.getAll().stream().map(Dish::getCalories).reduce((a,b)->a+b); // eliminated initial value
        System.out.println(totalCal3.get());

        // MAX and MIN

        System.out.println( nums.stream().reduce(Integer::max).get()); // returns optional .get()
        System.out.println(nums.stream().reduce(Integer::min).get());
        Optional<Integer> sum=nums.stream().reduce(Integer::sum);
        System.out.println(sum.get());
     System.out.println("COUNT");
     long dishCount = DishData.getAll().stream().count();
     System.out.println(dishCount);

    }



}
