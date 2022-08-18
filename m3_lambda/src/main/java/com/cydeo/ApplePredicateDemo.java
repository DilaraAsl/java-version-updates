package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplePredicateDemo {
    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<>(Arrays.asList(new Apple(300,Color.RED),
                new Apple(100,Color.GREEN),new Apple(200,Color.GREEN),new Apple(50,Color.GREEN)));

        ApplePredicate awp=new AppleWeightPredicate();
        List<Apple> heavyApple=filterApples(inventory,awp);

        List<Apple> greenApple=filterApples(inventory,new AppleGreenColorPredicate());

        System.out.println(heavyApple);
        System.out.println(greenApple);

    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){
        List<Apple> result=new ArrayList<>();
        for(Apple apple:inventory){
            if (applePredicate.test(apple)) // test returns boolean
            {
                result.add(apple);
            }
        }
        return result;
    }
}
