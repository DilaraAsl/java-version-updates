package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarDemo {
    public static void main(String[] args) {
        // no argument constructor

        Supplier<Car> car1=()->new Car(); //

        Supplier<Car> car2=Car::new;

        System.out.println(car1.get().getModel());

        //one argument constructor

        Function<Integer,Car> func1=Car::new;
        System.out.println(func1.apply(1998).toString());

        // two argument constructor

        BiFunction<String,Integer,Car> biFunc1=Car::new;
        System.out.println(biFunc1.apply("Toyota",2010).toString());
    }
}
