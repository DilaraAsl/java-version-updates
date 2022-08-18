package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> pred=(p)->p%2==0?true:false;

        Calculate operationSum=(x,y)-> System.out.println(x+y);
        Calculate sum=(x,y)->Calculator.findSum(x,y);

        Calculate operationSumTwo=Calculator::findSum;

        Calculate operationMultiples=Calculator::findMultiple; // static methods only
        Calculator obj=new Calculator();
        Calculate operationDifference=obj::findDifference;
        Calculate operationDifferenceTwo=new Calculator()::findDifference; // if the method is not static we need to call the method through an object
        operationSumTwo=Calculator::findSum;
        operationSum.calculate(10,23);
        operationSumTwo.calculate(120,133);
        operationMultiples.calculate(11,12);
        operationDifference.calculate(100,30);

        BiFunction<String,Integer,String> func=(str,i)->str.substring(i);
        BiFunction<String,Integer,String> funcTwo=String::substring; //String compiler knows the type we don't need to create a new object
                                                                    // Calculator type is not defined compiler needs
        ;
        System.out.println(funcTwo.apply("Dilara",2));

        Function<Integer,Double> doubleNumber=new MyClass()::method;
        BiFunction<MyClass,Integer,Double> doubleNumberTwo=MyClass::method;



        System.out.println(doubleNumber.apply(4));
        System.out.println(doubleNumberTwo.apply(new MyClass(),8));


        Consumer<Integer> display=p-> System.out.println();
        Consumer<Integer> displayTwo=System.out::println;

        displayTwo.accept(8);

// implementation with constructor


    }
}
