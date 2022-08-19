package com.cydeo.task;

import java.util.stream.Stream;

import static java.util.Comparator.comparing;

public class DishDemo {

    public static void main(String[] args) {


        //Print all dish's name that has less than 400 calories

        DishData.getAll().stream() // getAll() is a static method of DishData
                .filter(dish -> dish.getCalories() < 400)
                .forEach(System.out::println);


        //Print the length of the name of each dish
        DishData.getAll().stream() //Streaming Dish
                .map(Dish::getName)//Streaming Name
               // .map(dish->dish.length())
                .map(String::length) //Steaming Length of the names
                .forEach(System.out::println);


        //Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("******************************");
        //Print all dish name that are below 400 calories in sorted by calories
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories).reversed()) //imported  static java.util.Comparator.comparing;
                // sort based on calories first then map to get the  name of the dish
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("******************************");

        // sort by name
        DishData.getAll().stream()
                .filter(dish->dish.getCalories()<400)
                .sorted(comparing(Dish::getName))
                .forEach(System.out::println);


        Stream<Dish> dishStream=DishData.getAll().stream();
        dishStream
                .filter(d->d.isVegetarian())
                .map(Dish::getName)
                .forEach(System.out::println);

    }
}

