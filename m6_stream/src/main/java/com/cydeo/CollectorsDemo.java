package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7);
        //toCollection(Supplier) : is used to create a collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        // collects the numbers into a new arraylist
// the new List which is returned  is assigned to numbers ArrayList
        System.out.println(numberList);


        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 3 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        // Collectors.toList() instead of using Collectors.toCollection does not accept parameters

        List<Integer> numberList2 = numbers.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        Set<Integer> numberSet2 = numbers.stream()
                .filter(x -> x % 4 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        // toMap(Function,Function): returns a Collector interface that gathers the input data into a new map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                //    .collect(Collectors.toMap(Dish::getCalories,Dish::isVegetarian));
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);

        Map<Integer, Boolean> calorieMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getCalories, Dish::isVegetarian));
        System.out.println(calorieMap);


        // summingInt(ToIntFunction):returns a Collector that produces the sum of an Integer valued func

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        // counting(): returns a Collector that counts the number of the elements
        Long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        // averageingInt(ToIntFunction): returns double value the average of Integers passed values

       Double averageCalories=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(averageCalories);
        // joining(): is used to join various elements of a character or string array into a single object (concatenates)
        List<String> courses=Arrays.asList("Java","JS","Data Structures");
        String str=courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        // partitioningBy(): is used to partition a stream of objects (or a set of elements based on a given predicate)

        Map<Boolean,List<Dish>> veggieDish=DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        // groupingBy(); is used for grouping objects by some property and storing results in a Map instance
        Map<Type,List<Dish>> dishType=DishData.getAll().stream()  // Type Enum class
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }

}
