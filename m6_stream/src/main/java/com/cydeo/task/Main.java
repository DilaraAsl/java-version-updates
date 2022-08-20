package com.cydeo.task;

import java.util.function.BiFunction;

class CoordinateFinder implements BiFunction<Double, Double, String> {
    @Override
    public String apply(Double latitude, Double longitude) {
        return latitude + "\n" + longitude + "\n" + ": New York";
    }
}

public class Main {

    public static void main(String[] args) {

        Double latitude = 40.7127281;									// Line 1
        Double longitude = -74.0060152;									// Line 2
        CoordinateFinder coordinateFinder = new CoordinateFinder();		// Line 3

        String city = apply(latitude, longitude, coordinateFinder);		// Line 4
        System.out.println(city);										// Line 5

    }

    public static String apply(Double latitude, Double longitude, BiFunction<Double, Double, String> biFunction) {
        return biFunction.apply(latitude, longitude);					// Line 6
    }

}

// remove system class
//@FunctionalInterface
// remove line 1 and Line 2